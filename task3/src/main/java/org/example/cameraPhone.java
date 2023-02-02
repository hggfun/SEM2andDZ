package org.example;

public class cameraPhone extends Smartphone {
    int cameraPower;
    public cameraPhone() {
    }

    @Override
    public void getCharachteristics(int megapixels) {
        cameraPower = megapixels;
    }

    @Override
    public void writeMessage() {
        System.out.println("My camera is " + cameraPower + " megapixels");
    }
}
