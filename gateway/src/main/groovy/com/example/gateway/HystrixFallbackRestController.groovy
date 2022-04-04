package com.example.gateway

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HystrixFallbackRestController {

    @GetMapping("/api/fallback")
    public Mono<String> getFxSvcMsg() {
        return Mono.just("No response from Service1 and will be back shortly");
    }


}
