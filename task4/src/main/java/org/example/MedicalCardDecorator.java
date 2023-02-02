package org.example;

public class MedicalCardDecorator extends CardDecorator {
    MedicalCard myMedicalCard;
    public MedicalCardDecorator(Card card, MedicalCard medicalCard) {
        super(card);
        myMedicalCard = medicalCard;
    }
    @Override
    public void writeInfo() {
        myMedicalCard.writeInfo();
        source.writeInfo();
    }
}
