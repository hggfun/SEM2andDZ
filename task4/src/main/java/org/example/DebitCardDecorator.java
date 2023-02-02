package org.example;

public class DebitCardDecorator extends CardDecorator {
    DebitCard myDebitCard;
    public DebitCardDecorator(Card card, DebitCard debitCard) {
        super(card);
        myDebitCard = debitCard;
    }

    @Override
    public void writeInfo() {
        myDebitCard.writeInfo();
        source.writeInfo();
    }
}
