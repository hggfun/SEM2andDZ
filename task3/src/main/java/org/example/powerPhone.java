package org.example;

public class powerPhone extends Smartphone {
    int powerCPU;
    public powerPhone() {
        super();
    }

    @Override
    public void getCharachteristics(int cpu) {
        powerCPU = cpu;
    }

    @Override
    public void writeMessage() {
        System.out.println("My processor is " + powerCPU + " GHz");
    }
}
