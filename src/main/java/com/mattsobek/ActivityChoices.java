package com.mattsobek;

import java.util.Scanner;

public class ActivityChoices {
    private final Scanner input;

    public ActivityChoices() {
        this.input = new Scanner(System.in);
    }

    public void chooseActivity() {
        System.out.println("1 - Binary Searches\n");
        boolean isIntValid = false;
        //Scanner input = new Scanner(System.in);
        int userEntry;
        while (!isIntValid) {
            System.out.print("Select an activity or enter 0 to exit: ");
            if (!input.hasNextInt()) {
                userEntry = input.nextInt();
                if (intRangeTest(0, 2, userEntry)) {
                    isIntValid = true;
                    System.out.println("YAY!!!");
                } else {
                    System.out.println("Invalid entry.");
                    input.reset();
                }
            } else {
                System.out.println("Invalid entry.");
                input.reset();
            }
        }
    }

    public static boolean intRangeTest(int min, int max, int userInt) {
        if (userInt >= min && userInt <= max) {
            return true;
        } else {
            return false;
        }
    }
}
