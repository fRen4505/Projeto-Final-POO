package ruhrenmatmarc.ecomerce.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @PostMapping //Esse é pra criar 
    public ResponseEntity<User> createUser(@RequestBody String body){
        
        return null;
    }

    @GetMapping("/{userId}") //Esse busca o user por id
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId){
        
        return null;
    }
}
