package com.github.wlmx;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
@RequiredArgsConstructor
public class TestRestController {

    private final TestProperties testProperties;

    private final Environment environment;

    @Value("${spring.application.name}")
    private String appName;


    @GetMapping("/getConfigTestProperty")
    public String getConfigTestProperty() {
        return "testProperty=" + testProperties.getTestProperty();
    }

    @GetMapping
    public String id() {
        String port = environment.getProperty("server.port");
        String host = InetAddress.getLoopbackAddress().getHostName();

        return "id: [" + appName + "] (" + host + ":" + port + ")";
    }

}
