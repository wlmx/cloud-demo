package com.github.wlmx;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestCallerServiceController {

    @GetMapping
    public String home() {
        return "<html><a href=\"swagger-ui.html\">Swagger</a></html>";
    }
}
