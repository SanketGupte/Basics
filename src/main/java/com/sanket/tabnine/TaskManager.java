package com.sanket.tabnine;

import java.util.ArrayList;
import java.util.List;

/**
 * TaskManager class. Methods to add tasks, list tasks that return a list of tasks and mark tasks as done given the description.
 */
public class TaskManager {
    private final List<Task> tasks;

    /**
     * Constructor for TaskManager class.
     */
    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Adds a task to the list of tasks.
     *
     * @param task The task to be added.
     */
    public void addTask(Task task) {
        this.tasks.add(task);
    }

    /**
     * Returns a list of all tasks.
     *
     * @return A list of all tasks.
     */
    public List<Task> listTasks() {
        return this.tasks;
    }

    /**
     * Marks a task as done given its description.
     *
     * @param description The description of the task to be marked as done.
     */
    public void markTaskAsDone(String description) {
        for (Task task : this.tasks) {
            if (task.getDescription().equals(description)) {
                task.setDone(true);
            }
        }
    }

    /**
     * Removes a task from the list of tasks given its description.
     *
     * @param description The description of the task to be removed.
     */
    public void removeTask(String description) {
        for (Task task : this.tasks) {
            if (task.getDescription().equals(description)) {
                this.tasks.remove(task);
                break;
            }
        }
    }
}