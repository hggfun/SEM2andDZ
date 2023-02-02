package org.example;

public class Passport implements Card {
    String info;
    public Passport(String info) {
        this.info = info;
    }
    @Override
    public void writeInfo() {
        System.out.println("My passport is " + info);
    }
}
