package org.example;

public class batteryPhone extends Smartphone {
    int batterySize;
    public batteryPhone() {
        super();
    }

    @Override
    public void getCharachteristics(int battery) {
        batterySize = battery;
    }

    @Override
    public void writeMessage() {
        System.out.println("My battery is " + batterySize + " mAh");
    }
}
