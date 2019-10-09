package com.depromeet.warmingupteam0backend.controller;

import com.depromeet.warmingupteam0backend.dto.HelloRequest;
import com.depromeet.warmingupteam0backend.dto.HelloResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @PostMapping("/hello")
    public HelloResponse sayHello(@RequestBody HelloRequest helloRequest) {
        String name = helloRequest.getName();

        HelloResponse helloResponse = new HelloResponse();
        helloResponse.setMessage("Hello, " + name + "!");
        return helloResponse;
    }
}
