package com.programming.techie.microservice1.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.http.HttpMethod.GET;

@RestController
@RequestMapping("/microservice1")
public class Controller1 {
	
	@PreAuthorize("hasAuthority('SCOPE_trusted_create')")
    @GetMapping("/home")
    @ResponseStatus(HttpStatus.OK)
    public String helloRestTemplate() {
        return "Hello";
    }
    
	@PreAuthorize("hasAuthority('SCOPE_trusted_delete')")
    @GetMapping("/microservice1/delete")
    @ResponseStatus(HttpStatus.OK)
    public String helloRestTemplate2() {
        return "Hello";
    }

}
