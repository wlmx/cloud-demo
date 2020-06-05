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

    private final TestDatabaseService testDatabaseService;

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

    @GetMapping("/jooq")
    public String jooq() {
        return testDatabaseService.jooq();
    }

    @GetMapping("/jpa")
    public String jpa() {
        return testDatabaseService.jpa();
    }

    @GetMapping("/jdbc")
    public String jdbc() {
        return testDatabaseService.jdbc();
    }

}
