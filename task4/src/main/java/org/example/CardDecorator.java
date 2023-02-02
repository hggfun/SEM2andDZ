package org.example;

public class CardDecorator implements Card {
    Card source;
    public CardDecorator(Card card) {
        source = card;
    }
    @Override
    public void writeInfo() {
        source.writeInfo();
    }
}
