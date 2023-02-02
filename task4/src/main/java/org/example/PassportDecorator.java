package org.example;

public class PassportDecorator extends CardDecorator {
    Passport myPassport;
    public PassportDecorator(Card card, Passport passport) {
        super(card);
        myPassport = passport;
    }
    @Override
    public void writeInfo() {
        myPassport.writeInfo();
        source.writeInfo();
    }
}
