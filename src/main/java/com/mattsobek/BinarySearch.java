package com.mattsobek;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    private Scanner input;

    public BinarySearch(Scanner input) {
        this.input = input;
    }

    public void startBinarySearchActivity() {
        System.out.println("\n1 - Iterative Method\n2 - Recursive Method\n3 - Arrays.binarySearch() Method");
        System.out.println("Select a binary search type: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid entry. Select a binary search type: ");
        }
        int searchType = input.nextInt();
        /*while (!intRangeTest(1, 3, searchType)) {
            System.out.println("Invalid entry. Select a binary search type: ");
            searchType = input.nextInt();
        }
        System.out.println("Enter a target number between 1 and 99: ");
        int target = input.nextInt();

        switch (input.nextInt()) {
            case 1:
                break;
            case 2:
                System.out.println("\nRecursive Method");
                break;
            default:
                System.out.println("\nArrays.binarySearch() Method");
        }

        System.out.println("Enter a target number between 1 and 99: ");
        if (input.hasNextInt() && input.nextInt() > 0 && input.nextInt() < 3) {

        }*/
    }

    public boolean intRangeTest(int min, int max, int userInt) {
        if (userInt >= min && userInt <= max) {
            return true;
        } else {
            return false;
        }
    }

    public int[] intArrayGenerator(int targetToHide) {
        Random random = new Random();
        int[] randomArray = new int[random.nextInt(10, 21)];
        for (int i = 0; i < randomArray.length - 1; i++) {
            randomArray[i] = random.nextInt(1, 100);
        }
        randomArray[randomArray.length - 1] = targetToHide;
        Arrays.sort(randomArray);
        return randomArray;
    }

    public void iterative(int [] intArray, int target) {
        System.out.println("\nIterative Method");
        System.out.println("Enter a target number to hide between 1 and 99: ");

        int low = 0;
        int high = intArray.length - 1;
        int mid = (low + high)/2;

        while (low <= high) {
            if (intArray[mid] == target) {
                break;
            } else if (intArray[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high)/2;
        }
        System.out.println("Target int " + target + " was found at array index " + mid + ".");
    }

    public void recursive(int[] intArray, int target) {
        int low = 0;
        int high = intArray.length - 1;
        int mid = (low + high)/2;

        System.out.println("Target int " + target + " was found at array index " + mid + ".");
    }

    public void arraysBinarySearch(int[] intArray, int target) {
        int low = 0;
        int high = intArray.length - 1;
        int mid = (low + high)/2;

        System.out.println("Target int " + target + " was found at array index " + mid + ".");
    }
}
