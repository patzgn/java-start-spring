package com.example.entityconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LibraryApplication.class, args);
        BookRepository bookRepository = context.getBean(BookRepository.class);
        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", "Greg", 312, 2002);
        bookRepository.save(book1);
        Book book2 = new Book("Wilk z Wallstreet", "Jordan Belfort", "Świat Książki", 512, 2014);
        bookRepository.save(book2);
    }

}
