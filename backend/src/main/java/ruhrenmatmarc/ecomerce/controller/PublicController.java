package ruhrenmatmarc.ecomerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {
    @GetMapping("/")
    public String publicHello(){
        return "Hello, this is a public endpoint!";
    }
}
