package com.example.demo2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyController {

    @PostMapping("/echo")
    public void echo(@RequestBody String requestBody) {
        System.out.println(requestBody);
    }
}