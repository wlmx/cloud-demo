package com.github.wlmx;

import org.springframework.stereotype.Component;

@Component
public class TestServiceClientFallback implements TestServiceClient{

    @Override
    public String id() {
        return "test-service-fallback:id not avaible";
    }

    @Override
    public String notFoundMethod() {
        return "test-service-fallback:404";
    }

    @Override
    public String getConfigTestProperty() {
        return "test-service-fallback:getConfigTestProperty not available";
    }
}
