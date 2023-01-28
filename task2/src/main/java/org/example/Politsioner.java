package org.example;

public class Politsioner extends EventListener{
    private String codeNum;
    public Politsioner(String name) {
        codeNum = name;
    }

    @Override
    public void update(String eventType, int amount) {
        System.out.println("I am " + codeNum + ", and I give you fine in size " + amount);
    }
}
