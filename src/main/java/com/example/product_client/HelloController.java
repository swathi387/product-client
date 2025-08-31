package com.example.product_client;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
  @GetMapping("/")
  public String hello() { return "Product Client WAR is running!"; }
}
