package com.quancheng.saluki.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableDiscoveryClient
public class ScExampleServerApp {

  public static void main(String[] args) {
    SpringApplication.run(ScExampleServerApp.class, args);
  }

}
