package com.sanket.tabnine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void testTaskConstructor() {
        Task task = new Task("Test Task");
        assertEquals("Test Task", task.getDescription());
        assertFalse(task.isDone());
    }

    @Test
    void testTaskSetDone() {
        Task task = new Task("Test Task");
        task.setDone(true);
        assertTrue(task.isDone());
    }

    @Test
    void testTaskToString() {
        Task task = new Task("Test Task");
        assertEquals("Task{description='Test Task', done=false}", task.toString());
    }
}