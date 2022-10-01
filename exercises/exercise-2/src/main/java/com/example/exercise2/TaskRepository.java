package com.example.exercise2;

import java.util.Optional;

interface TaskRepository {
    Task save(Task task);
    Optional<Task> findById(Long id);
}
