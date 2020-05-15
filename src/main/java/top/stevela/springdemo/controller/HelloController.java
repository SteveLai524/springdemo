package top.stevela.springdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${book.name}")
    private String bookName;

    @Value("${book.author}")
    private String author;

    @GetMapping("hello")
    public String hello() {
        return "Hello, World";
    }

    @GetMapping("book")
    public String book() {
        return this.bookName + ":" + this.author;
    }
}


