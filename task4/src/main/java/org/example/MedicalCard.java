package org.example;

public class MedicalCard implements Card {
    String info;
    public MedicalCard(String info) {
        this.info = info;
    }
    @Override
    public void writeInfo() {
        System.out.println("My medical card is: " + info);
    }
}
