package com.nikvol.hello_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> hello() {

        return Map.of(
                "message", "Hello from Spring Boot",
                "team", "Team NikVol",
                "indexes", List.of(75660, 75668)
        );
    }
}