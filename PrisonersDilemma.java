package com.example.javaproject;

import java.util.Scanner;

public class PrisonersDilemma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Prisoner's Dilemma!");
        System.out.println("You will play against a computer.");
        System.out.println("You have two choices: cooperate or defect.");
        System.out.println("If you both cooperate, you each get 3 points.");
        System.out.println("If you both defect, you each get 1 point.");
        System.out.println("If one cooperates and the other defects, the defector gets 5 points and the cooperator gets 0 points.");
        System.out.println();

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println();

        int playerScore = 0;
        int computerScore = 0;

        while (true) {
            System.out.println("Your score: " + playerScore);
            System.out.println("Computer's score: " + computerScore);
            System.out.println();

            System.out.print("Enter your choice (C for cooperate, D for defect): ");
            String playerChoiceString = scanner.nextLine();
            char playerChoice = playerChoiceString.toUpperCase().charAt(0);

            char computerChoice;
            if (Math.random() < 0.5) {
                computerChoice = 'C';
            } else {
                computerChoice = 'D';
            }
            System.out.println("Computer's choice: " + computerChoice);
            System.out.println();

            int playerPayoff = 0;
            int computerPayoff = 0;
            if (playerChoice == 'C') {
                if (computerChoice == 'C') {
                    playerPayoff = 3;
                    computerPayoff = 3;
                } else {
                    playerPayoff = 0;
                    computerPayoff = 5;
                }
            } else {
                if (computerChoice == 'C') {
                    playerPayoff = 5;
                    computerPayoff = 0;
                } else {
                    playerPayoff = 1;
                    computerPayoff = 1;
                }
            }

            playerScore += playerPayoff;
            computerScore += computerPayoff;

            System.out.println("Your payoff: " + playerPayoff);
            System.out.println("Computer's payoff: " + computerPayoff);
            System.out.println();
        }
    }
}
