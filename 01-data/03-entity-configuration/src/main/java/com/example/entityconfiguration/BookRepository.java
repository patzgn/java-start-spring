package com.example.entityconfiguration;

import org.springframework.data.repository.CrudRepository;

interface BookRepository extends CrudRepository<Book, Long> {
}
