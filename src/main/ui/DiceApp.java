package main.ui;

import java.util.Scanner;

public class DiceApp {
    private Scanner input;
    
    public DiceApp() {
        runDiceApp();
    }

    private void runDiceApp() {
        initialize();
        runMainMenu();
    }

    private void runMainMenu() {
        boolean run = true;
        String command;
        while (run) {
            displayMainMenu();
            command = input.next();

            if (command.equals("quit")) {
                run = false;
            } else {
                processCommand(command);
            }
        }
    }

    private void processCommand(String command) {
        if (command.equals("roll")) {
            System.out.println("\t IT DONT WORK YET DUMBASS");
        } else {
            System.out.println("Not a command...");
        }
    }

    private void displayMainMenu() {
        System.out.println("This is a dice application.");
        System.out.println("Type 'roll' to roll a dice.");

    }

    private void initialize() {
        input = new Scanner(System.in);
    }
}
