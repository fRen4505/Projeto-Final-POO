package ruhrenmatmarc.ecomerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        System.out.println("Config Inicializada");
        
        http //objeto do tipo HttpSecurity
        .csrf(Customizer.withDefaults()) //
        .authorizeHttpRequests(auth -> auth
        .requestMatchers("/login/**").permitAll()
        .requestMatchers("/cadastro/**").permitAll()
       // .requestMatchers("/admin/**").hasRole("ADMIN")
        .requestMatchers("/home/**").hasRole("USER")
        .anyRequest().authenticated())
        .httpBasic(Customizer.withDefaults());
        return http.build();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(); //Codifica as senhas
    }
}

/*Proteção de URLs: Esse código define que algumas páginas podem ser acessadas sem login 
(como /public/**), 
outras exigem um papel específico (como /admin/** para quem tem a role ADMIN), 
e o restante exige que o usuário esteja autenticado.

Autenticação Básica: Ele também configura a autenticação básica HTTP, onde o usuário precisa fornecer nome de usuário e senha diretamente no cabeçalho de cada requisição.

Codificação de Senhas: O método passwordEncoder garante que as senhas dos usuários sejam seguras ao armazená-las no banco de dados, utilizando o algoritmo BCrypt.

Conclusão:
Este trecho de código define como a segurança deve ser aplicada na sua aplicação Spring Boot, protegendo as rotas (URLs) com base no tipo de autenticação e nos papéis dos usuários. Ele também garante que as senhas sejam armazenadas de maneira segura.*/
