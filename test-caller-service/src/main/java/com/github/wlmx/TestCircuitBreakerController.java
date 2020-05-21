package com.github.wlmx;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestCircuitBreakerController {

    private final TestServiceClient testServiceClient;

    private final DiscoveryClient discoveryClient;

    @GetMapping("/feign/id")
    public String feignId() {
        return testServiceClient.id();
    }

    @GetMapping("/feign/404")
    public String notFoundMethod() {
        return testServiceClient.notFoundMethod();
    }

    @GetMapping("/feign/getConfigTestProperty")
    public String getConfigTestProperty() {
        return testServiceClient.getConfigTestProperty();
    }


}
