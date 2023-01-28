package org.example;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer();
        String command = " ";
        System.out.println("Hello, enter command:\n1)Turn On\n2)Turn Off\n3)Start OS\n4)Do first program\n5)Do second program\n6)Finish work");
        while (!Objects.equals(command, "Finish")) {
            command = scanner.nextLine();
            switch (command) {
                case "Turn On":  computer.setTurnedOn(); break;
                case "Turn Off":  computer.setTurnedOff(); break;
                case "Start OS":  computer.setOS(); break;
                case "Do first program":  computer.startProgram(1); break;
                case "Do second program":  computer.startProgram(2); break;
                case "Finish": break;
                default: System.out.println("wrong command");
            }
        }
    }
}