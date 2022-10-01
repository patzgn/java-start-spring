package com.example.exercise2;

import com.example.exercise2.dto.NewTaskDto;
import com.example.exercise2.dto.TaskDurationDto;
import com.example.exercise2.exception.TaskAlreadyCompletedException;
import com.example.exercise2.exception.TaskAlreadyStartedException;
import com.example.exercise2.exception.TaskNotFoundException;
import com.example.exercise2.exception.TaskNotStartedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private static long nextId = 1;
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Transactional
    public Long saveTask(NewTaskDto task) {
        Task taskToSave = new Task(task.getTitle(), task.getDescription(), task.getPriority());
        taskToSave.setId(nextId);
        Task savedTask = taskRepository.save(taskToSave);
        nextId++;
        return savedTask.getId();
    }

    public Optional<String> getTaskInfo(Long taskId) {
        return taskRepository.findById(taskId).map(Task::toString);
    }

    @Transactional
    public LocalDateTime startTask(Long taskId) {
        Task task = taskRepository.findById(taskId)
                .orElseThrow(TaskNotFoundException::new);
        if (task.getStartTime() != null) {
            throw new TaskAlreadyStartedException();
        }
        task.setStartTime(LocalDateTime.now());
        return task.getStartTime();
    }

    @Transactional
    public TaskDurationDto completeTask(Long taskId) {
        Task task = taskRepository.findById(taskId)
                .orElseThrow(TaskNotFoundException::new);
        if (task.getStartTime() == null) {
            throw new TaskNotStartedException();
        } else if (task.getCompletionTime() != null) {
            throw new TaskAlreadyCompletedException();
        }
        task.setCompletionTime(LocalDateTime.now());
        return new TaskDurationDto(task.getStartTime(), task.getCompletionTime());
    }

    public List<String> getAllNotStartedTasksInfo() {
        return taskRepository.findAllByStartTimeIsNullOrderByPriorityDesc()
                .stream()
                .map(Task::toString)
                .toList();
    }

    public List<String> getAllCompletedTasksInfo() {
        return taskRepository.findAllByCompletionTimeIsNotNullOrderByCompletionTimeDesc()
                .stream()
                .map(Task::toString)
                .toList();
    }
}
