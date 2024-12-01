package ruhrenmatmarc.ecomerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfog {
    
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println("InMemoryUserDetailsManager configurado!");
        UserDetails user = User.builder()
        .username("user")
        .password(encoder.encode("password"))
        .roles("USER")
        .build();

        // UserDetails admin = User.builder()
        // .username("admin")
        // .password(encoder.encode("adminpass"))//senha codificada
        // .roles("ADMIN")
        // .build();

        return new InMemoryUserDetailsManager(user);

    }
}
