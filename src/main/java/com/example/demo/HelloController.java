package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @GetMapping("/")
    public String makeRequest() {
        kafkaProducerService.sendMessage("my-topic","message xy");
        return "hello";
    }
}