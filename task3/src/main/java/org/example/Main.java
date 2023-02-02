package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();
        while (t!=0) {
            Smartphone smartphone = switch (t) {
                case 1 -> new cameraPhone();
                case 2 -> new powerPhone();
                case 3 -> new batteryPhone();
                default -> new cameraPhone();
            };
            smartphone.getCharachteristics(scanner.nextInt());
            smartphone.writeMessage();
            t = scanner.nextInt();
        }
    }
}