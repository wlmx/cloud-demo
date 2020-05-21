package com.github.wlmx;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "test-service", fallback = TestServiceClientFallback.class)
public interface TestServiceClient {

    @GetMapping
    String id();

    @GetMapping("/404")
    String notFoundMethod();

    @GetMapping("getConfigTestProperty")
    String getConfigTestProperty();
}
