package com.sanket.tabnine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for TaskManager.
 */
public class TaskManagerTest {

    private TaskManager taskManager;
    private Task task1;
    private Task task2;

    /**
     * Setup method to initialize TaskManager, Task1 and Task2 before each test.
     */
    @BeforeEach
    void setUp() {
        taskManager = new TaskManager();
        task1 = new Task("Task 1");
        task2 = new Task("Task 2");
    }

    /**
     * Test method to verify the addition of tasks to the TaskManager.
     */
    @Test
    void testAddTask() {
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        assertEquals(2, taskManager.listTasks().size());
    }

    /**
     * Test method to verify the listing of tasks in the TaskManager.
     */
    @Test
    void testListTasks() {
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        List<Task> tasks = taskManager.listTasks();
        assertTrue(tasks.contains(task1));
        assertTrue(tasks.contains(task2));
    }

    /**
     * Test method to verify the marking of tasks as done in the TaskManager.
     */
    @Test
    void testMarkTaskAsDone() {
        taskManager.addTask(task1);
        taskManager.markTaskAsDone(task1.getDescription());
        assertTrue(taskManager.listTasks().get(0).isDone());
    }

    /**
     * Test method to verify the removal of tasks from the TaskManager.
     */
    @Test
    void testRemoveTask() {
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.removeTask(task1.getDescription());
        List<Task> tasks = taskManager.listTasks();
        assertTrue(tasks.contains(task2));
        assertEquals(1, tasks.size());
    }
}