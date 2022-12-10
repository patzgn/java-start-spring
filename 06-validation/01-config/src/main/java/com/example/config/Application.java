package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        PersonService personService = context.getBean(PersonService.class);
        Person person1 = new Person("Jan", "Kowalski", "jan@kowalski.org", 35);
        System.out.println("Dodaję " + person1);
        personService.addPerson(person1);

        Person person2 = new Person("Anna", null, "dobryemail@example.com", 22);
        System.out.println("Dodaję " + person2);
        personService.addPerson(person2);

        Person person3 = new Person("Piotr", "Kaleta", "zlyEmail", 0);
        System.out.println("Dodaję " + person3);
        personService.addPerson(person3);

        System.out.println(personService);
    }

}
