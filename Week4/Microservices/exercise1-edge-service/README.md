# Exercise 1: Edge Service for Routing and Filtering

Implements an API gateway edge service using **Spring Boot 3** and **Spring Cloud Gateway**
that routes requests and logs them via a custom global filter.

## What it does
- Routes any request matching `/example/**` to `http://example.org`.
- `LoggingFilter` (a `GlobalFilter`) logs the URI of every incoming request before it's
  forwarded downstream.

## Project structure
```
exercise1-edge-service/
├── pom.xml
├── README.md
└── src/main/
    ├── java/com/example/edgeservice/
    │   ├── EdgeServiceApplication.java
    │   └── filter/LoggingFilter.java
    └── resources/
        └── application.properties
```

## How to run
```bash
cd exercise1-edge-service
mvn spring-boot:run
```
The gateway starts on port `8080`.

## How to test
```bash
curl -v http://localhost:8080/example/anything
```
Check the console logs — you should see a line like:
```
Request: http://localhost:8080/example/anything
```
confirming the `LoggingFilter` intercepted the request, and the gateway forwards it to
`http://example.org`.
