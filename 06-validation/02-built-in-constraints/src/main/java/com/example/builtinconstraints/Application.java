package com.example.builtinconstraints;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.util.Set;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        Validator validator = context.getBean(Validator.class);
        Person person = new Person(
                null,
                "Kowalski",
                "87041277815",
                LocalDate.of(2030, 4, 12),
                "jan@kowalski.xyz",
                "asd",
                "https://kowalski.xyz"
        );
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);
        if (!constraintViolations.isEmpty()) {
            System.out.println("Obiekt jest nieprawidłowy. Złamane ograniczenia:");
            for (ConstraintViolation<Person> violation : constraintViolations) {
                System.out.printf(">%s %s (%s)\n",
                        violation.getPropertyPath(),
                        violation.getMessage(),
                        violation.getInvalidValue()
                );
            }
        } else {
            System.out.println("Dane osoby są prawidłowe");
        }
    }

}
