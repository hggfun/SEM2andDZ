package org.example;

public class Computer {
    private Boolean turnedOn;
    private Boolean OS;
    private Program prog1;
    private Program prog2;

    public Computer() {
        turnedOn = false;
        OS = false;
        prog1 = new Program("Program 1");
        prog2 = new Program("Program 2");
    }
    public void setTurnedOn() {
        System.out.println("You started computer");
        turnedOn = true;
    }
    public void setTurnedOff() {
        if (turnedOn) {
            turnedOn = false;
            OS = false;
            System.out.println("You turned off computer");
        } else {
            System.out.println("The computer is not turned on now");
        }
    }

    public void setOS() {
        if (turnedOn) {
            if(OS) {
                System.out.println("The OS is already turned on");
            } else {
                System.out.println("You started OS");
                OS = true;
            }
        } else {
            System.out.println("You should turn on computer");
        }
    }
    
    public void startProgram(int t) {
        if (OS) {
            if(t == 1) {
                prog1.doTask();
            } else if (t == 2) {
                prog2.doTask();
            } else {
                System.out.println("This program doesn't exist");
            }
        } else {
            System.out.println("You should turn on OS");
        }

    }
}
