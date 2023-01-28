package org.example;

public class Voditel extends EventListener {
    private String name;
    public Voditel (String name) {
        this.name = name;
    }
    @Override
    public void update(String eventType, int amount) {
        System.out.println("Oh no, I am (" + name + "), have to pay " + amount + " rubles");
    }
}
