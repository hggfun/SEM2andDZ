package org.example;

public class Program {
    private String name;
    public Program(String name) {
        this.name = name;
    }
    public void doTask() {
        System.out.println("You started: " + name);
    }
}
