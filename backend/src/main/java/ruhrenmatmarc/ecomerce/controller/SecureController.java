package ruhrenmatmarc.ecomerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {
    
    @GetMapping("/user/hello")
    public String userHello(){
        return "Hello, User! - Autenticado";


    }

    @GetMapping("admin/hello")
    public String adminHello(){
        return "ADM AUTENTICADO";
    }
}