package com.example.demo30beta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/book")
public class SampleRestController {
    @GetMapping
    public Book getBook(){
        return new Book("やさしいJava",2580);
    }
}
