package com.sanket.tabnine;

/**
 * Task class represents a task with a description and a boolean value indicating whether it's done.
 *
 * @author Sanket
 */
public class Task {

    private final String description;
    private boolean done;

    /**
     * Constructor for Task class.
     *
     * @param description The description of the task.
     */
    public Task(String description) {
        this.description = description;
        this.done = false;
    }

    /**
     * Getter method for the task's description.
     *
     * @return The description of the task.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Checks if the task is done.
     *
     * @return True if the task is done, false otherwise.
     */
    public boolean isDone() {
        return this.done;
    }

    /**
     * Setter method for the task's done status.
     *
     * @param done The boolean value indicating whether the task is done.
     */
    public void setDone(boolean done) {
        this.done = done;
    }

    /**
     * Returns a string representation of the task.
     *
     * @return A string containing the task's description and done status.
     */
    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", done=" + done +
                '}';
    }
}