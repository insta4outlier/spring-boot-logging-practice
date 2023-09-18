package com.example.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    private final Map<String, String> map = Map.of(
            "apple", "사과",
            "banana", "바나나",
            "rabbit", "토끼",
            "computer", "컴퓨터"
    );

    @GetMapping("/ping")
    public String ping() {

        return "pong";

    }

    @GetMapping("/search")
    public String search(@RequestParam(name="q") String query) {

        return this.map.getOrDefault(query, "no result");

    }

}
