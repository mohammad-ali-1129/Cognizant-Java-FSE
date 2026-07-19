package com.example.resilience.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Serves the fallback response when the circuit breaker for the downstream
 * service is open (i.e. the service is failing or timing out).
 */
@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("The service is currently unavailable. Please try again later.");
    }
}
