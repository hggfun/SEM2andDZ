package org.example;

public class DebitCard implements Card {
    String info;
    public DebitCard(String info) {
        this.info = info;
    }
    @Override
    public void writeInfo() {
        System.out.println("My debit card is: " + info);
    }
}
