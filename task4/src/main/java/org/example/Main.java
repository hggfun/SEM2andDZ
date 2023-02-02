package org.example;

public class Main {
    public static void main(String[] args) {
        Card card = new DebitCardDecorator(new MedicalCardDecorator(new Passport("12341234"), new MedicalCard("123")), new DebitCard("1234 1234 1234 1234"));
        card.writeInfo();
    }
}