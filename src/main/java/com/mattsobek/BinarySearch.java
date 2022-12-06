package com.mattsobek;

import java.util.*;

public class BinarySearch {
    Scanner input = new Scanner(System.in);

    public BinarySearch() {
    }

    public void chooseBinarySearchType() {
        System.out.println("\nBinary Searches");
        System.out.println("1 - Iterative Method");
        //System.out.println("2 - Recursive Method");
        //System.out.println("3 - Arrays.binarySearch() Method");
        boolean isIntValid = false;
        int userEntry = -1;
        while (!isIntValid) {
            System.out.print("Select a binary search type, enter M to return to the main menu, or enter 0 to exit: ");
            if (input.hasNextInt()) {
                userEntry = input.nextInt();
                if (userEntry >= 0 && userEntry <= 3) {
                    isIntValid = true;
                } else {
                    System.out.println("Invalid entry.");
                }
            } else if (input.next().equalsIgnoreCase("m")) {
                Main.menuCreator();
            } else {
                System.out.println("Invalid entry.");
            }
        }
        switch (userEntry) {
            case 0 -> {
                System.out.println("\nHave a nice day!");
                System.exit(0);
            }
            case 1 -> iterativeSearch();
            case 2 -> recursiveSearch();
            case 3 -> arraysBinarySearch();
            default -> {
            }
        }
    }

    // binary search type methods
    public void iterativeSearch() {
        System.out.println("\nIterative Method");
        int userTarget = getUserTargetInt();
        int[] intArray = uniqueIntArrayGenerator(userTarget);

        int low = 0;
        int high = intArray.length - 1;
        int mid = (low + high)/2;
        int index = -1;
        while (low <= high) {
            if (intArray[mid] == userTarget) {
                index = mid;
                break;
            } else if (intArray[mid] < userTarget) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high)/2;
        }
        if (index >= 0) {
            System.out.println("Target int " + userTarget + " was found at array index " + index + ".");
        } else {
            System.out.println("Target int " + userTarget + " was not found.");
        }
        chooseBinarySearchType();
    }

    public void recursiveSearch() {
        // TODO - recursive search logic
        /*System.out.println("\nRecursive Method");
        int userTarget = getUserTargetInt();
        int[] intArray = uniqueIntArrayGenerator(userTarget);

        int low = 0;
        int high = intArray.length - 1;

        if (high >= low) {
            int mid = (low + (high - low))/2;
            if (intArray[mid] == userTarget) {
                return mid;
            } else if (intArray[mid] > userTarget) {
                return;
            }
        }*/
    }

    public void arraysBinarySearch() {
        // TODO - arrayBinarySearch() logic
    }

    // helper methods
    public int[] uniqueIntArrayGenerator(int targetToHide) {
        Random random = new Random();
        Set<Integer> randomIntSet = new HashSet<>();
        int numOfInts = random.nextInt(10, 21);
        int[] randomArray = new int[numOfInts];
        randomIntSet.add(targetToHide);
        for (int i = 0; i < numOfInts; i++) {
            boolean isDuplicate = true;
            while (isDuplicate) {
                int randomInt = random.nextInt(1, 100);
                if (!randomIntSet.contains(randomInt)) {
                    randomIntSet.add(randomInt);
                    isDuplicate = false;
                }
            }
        }
        System.out.println("Array size: " + randomArray.length);
        int count = 0;
        for (int i : randomIntSet) {
            randomArray[count] = i;
            count++;
        }
        System.out.println("Random array: " + Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println("Sorted array: " + Arrays.toString(randomArray));
        return randomArray;
    }

    private int getUserTargetInt() {
        boolean isInputValid = false;
        int userTarget = -1;
        while (!isInputValid) {
            System.out.print("Enter a target number to hide between 1 and 99: ");
            if (input.hasNextInt()) {
                userTarget = input.nextInt();
                if (userTarget >= 1 && userTarget <= 99) {
                    isInputValid = true;
                } else {
                    System.out.println("Invalid entry.");
                }
            } else {
                System.out.println("Invalid entry.");
                input.next();
            }
        }
        System.out.println("Target number: " + userTarget);
        return userTarget;
    }
}