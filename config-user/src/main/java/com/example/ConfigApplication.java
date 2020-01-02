package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConfigApplication.class, args);
  }

  @RefreshScope
  @RestController
  static class MessageRestController {

    @Value("${user.role}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
      return "This prints out the config set by the config server: " + this.message;
    }
  }
}
