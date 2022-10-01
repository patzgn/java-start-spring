package com.example.exercise2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class TodoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TodoApplication.class, args);
        TaskController taskController = context.getBean(TaskController.class);
        taskController.loop();
    }

    @Bean
    Scanner scanner() {
        return new Scanner(System.in);
    }

}
