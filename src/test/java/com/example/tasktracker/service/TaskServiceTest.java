package com.example.tasktracker.service;

import com.example.tasktracker.entity.Task;
import com.example.tasktracker.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @Test
    void shouldReturnAllTasks() {

        Task task = new Task();
        task.setTitle("Demo Task");

        when(taskRepository.findAll())
                .thenReturn(List.of(task));

        List<Task> tasks = taskService.findAll();

        assertEquals(1, tasks.size());
        assertEquals("Demo Task", tasks.getFirst().getTitle());
    }
}
