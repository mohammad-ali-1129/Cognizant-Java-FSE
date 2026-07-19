# Exercise 3: Resilience Patterns in an API Gateway

Implements a **circuit breaker** resilience pattern in a Spring Cloud Gateway
route using **Resilience4j**, so the gateway degrades gracefully (via a fallback
response) instead of failing when a downstream service is slow or unavailable.

## Project structure
```
exercise3-resilience/
├── pom.xml
├── README.md
└── src/main/
    ├── java/com/example/resilience/
    │   ├── ResilienceGatewayApplication.java
    │   ├── config/ResilienceConfiguration.java
    │   └── controller/FallbackController.java
    └── resources/application.properties
```

## What it does
- `ResilienceConfiguration` defines a default Resilience4j circuit breaker + time-limiter
  (4s timeout) configuration applied to all circuit breakers in the app.
- `application.properties` defines route `example_resilient_route`, which forwards
  `/resilient/**` to `https://httpbin.org`, wrapped in a `CircuitBreaker` gateway filter
  named `exampleCircuitBreaker`, with a fallback to `/fallback` if the circuit opens.
- `exampleCircuitBreaker` is tuned via `resilience4j.circuitbreaker.instances.*` properties
  (10-call sliding window, 50% failure threshold to trip open, 10s wait before retrying).
- `FallbackController` returns a friendly "service unavailable" message when the circuit
  is open, instead of the caller seeing a raw error.

> **Note on dependencies:** the exercise brief lists `resilience4j-spring-boot2`, but that
> starter targets traditional **Servlet**-based Spring MVC apps. Spring Cloud Gateway is
> **reactive** (built on WebFlux), so the correct dependency is
> `spring-cloud-starter-circuitbreaker-reactor-resilience4j`, which is what's used here —
> worth flagging to your instructor/TA if they ask why it differs from the handout.

## How to run
```bash
cd exercise3-resilience
mvn spring-boot:run
```

## How to test
**Normal case** (fast response, circuit stays closed):
```bash
curl http://localhost:8080/resilient/get
```

**Trip the circuit** (simulate a slow/failing downstream service — httpbin's `/delay/{n}`
endpoint sleeps `{n}` seconds before responding, which exceeds our 4s timeout):
```bash
for i in {1..10}; do curl http://localhost:8080/resilient/delay/6; done
```
After enough timeouts cross the 50% failure threshold, the circuit opens and you'll start
seeing the fallback message instantly instead of waiting:
```
The service is currently unavailable. Please try again later.
```

**Check circuit breaker state:**
```bash
curl http://localhost:8080/actuator/health
curl http://localhost:8080/actuator/circuitbreakers
```
