package com.mattsobek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menuCreator();
    }

    public static void menuCreator() {
        System.out.println("\nWelcome to the Java Playground!");
        System.out.println("1 - Binary Searches");
        Scanner input = new Scanner(System.in);
        boolean isInputValid = false;
        int userEntry = -1;
        while (!isInputValid) {
            System.out.print("Select an activity or enter 0 to exit: ");
            if (input.hasNextInt()) {
                userEntry = input.nextInt();
                if (userEntry >= 0 && userEntry <= 1) {
                    isInputValid = true;
                } else {
                    System.out.println("Invalid entry.");
                }
            } else {
                System.out.println("Invalid entry.");
                input.next();
            }
        }
        switch (userEntry) {
            case 0 -> {
                System.out.println("\nHave a nice day!");
                System.exit(0);
            }
            case 1 -> {
                BinarySearch binarySearch = new BinarySearch();
                binarySearch.chooseBinarySearchType();
            }
        }
    }
}