package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Police GAI = new Police();
        GAI.addPolitsioner("1");
        GAI.addPolitsioner("2");
        GAI.addPolitsioner("3");
        GAI.addPolitsioner("4");
        GAI.addPolitsioner("5");
        GAI.addVoditel("A");
        GAI.addVoditel("B");
        GAI.addVoditel("C");
        GAI.addVoditel("D");
        GAI.addVoditel("E");
        String command = " ";
        int amount = 0;
        System.out.println("Now enter commands in format: <driver_name (A, B, C, D or E)> <fine size>");
        while (!command.equals("finish")) {
            command = scanner.nextLine();
            amount = Integer.parseInt(command.split(" ")[1]);
            command = command.split(" ")[0];
            GAI.overSpeedLimit(amount, command);
        }
    }
}