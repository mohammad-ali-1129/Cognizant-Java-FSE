# Exercise 2: Load Balancing in an API Gateway

Implements client-side load balancing in a **Spring Cloud Gateway** using
**Spring Cloud LoadBalancer**, with a custom random-selection strategy instead
of the default round-robin.

## Project structure
```
exercise2-load-balancing/
├── pom.xml                                # the gateway
├── README.md
├── src/main/
│   ├── java/com/example/loadbalancer/
│   │   ├── LoadBalancingGatewayApplication.java
│   │   └── config/LoadBalancerConfiguration.java
│   └── resources/application.properties
└── example-service/                       # simple backend used to test load balancing
    ├── pom.xml
    └── src/main/
        ├── java/com/example/exampleservice/ExampleServiceApplication.java
        └── resources/application.properties
```

## What it does
- `application.properties` defines route `load_balanced_route`: requests to
  `/loadbalanced/**` are sent to `lb://example-service` — the `lb://` scheme tells
  the gateway to load-balance across all known instances of `example-service`.
- Two instances are registered via Spring Cloud's built-in **SimpleDiscoveryClient**
  (no Eureka/Consul server required) at `localhost:8081` and `localhost:8082`.
- `LoadBalancerConfiguration` swaps the default round-robin balancer for a
  `RandomLoadBalancer`, so requests are distributed randomly across the two instances.

## How to run
Open **3 terminals**:

```bash
# Terminal 1: first backend instance
cd example-service
mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081

# Terminal 2: second backend instance
cd example-service
mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8082

# Terminal 3: the gateway
cd exercise2-load-balancing   # (the folder containing this README)
mvn spring-boot:run
```

## How to test
```bash
curl http://localhost:8080/loadbalanced/greeting
curl http://localhost:8080/loadbalanced/greeting
curl http://localhost:8080/loadbalanced/greeting
```
Run it several times — the response should alternate/randomize between:
```
Hello from example-service instance running on port 8081
Hello from example-service instance running on port 8082
```
confirming requests are being load-balanced across both instances.

> **Note:** `LoadBalancerConfiguration` is written exactly to the assignment's expected
> pattern (a plain `@Configuration` bean). In production Spring Cloud apps, this is
> usually placed in a class **not** picked up by component scanning and wired in via
> `@LoadBalancerClients(defaultConfiguration = ...)` on the main application class, so it
> only applies to specific named clients rather than globally. Worth mentioning if your
> instructor asks about best practices.
