package com.example.demo30beta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/book")
public class SampleRestController {
    class Book{
        private String name;
        private int price;
        public Book(String name,int price) {
            this.name = name;
            this.price = price;
        }
        public String getName(){
            return name;
        }
        public int getPrice(){
            return price;
        }
    }
    @GetMapping
    public Book getBook(){
        return new Book("やさしいJava",2580);
    }
}
