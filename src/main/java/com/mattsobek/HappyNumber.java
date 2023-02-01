package com.mattsobek;

import java.util.ArrayList;

public class HappyNumber {


    public boolean isHappyNumber(int inputNum) {
        boolean result = false;
        boolean resumeProcess = true;
        ArrayList<Integer> storedNums = new ArrayList<>();

        while (resumeProcess) {
            if (inputNum == 1) {
                resumeProcess = false;
                result = true;
            } else if (storedNums.contains(inputNum)) {
                resumeProcess = false;
            } else {
                int storedInputNum = inputNum;
                int totalNum = 0;
                int tempNum;
                while (storedInputNum > 0) {
                    tempNum = storedInputNum % 10;
                    totalNum += tempNum * tempNum;
                    storedInputNum /= 10;
                }
                storedNums.add(totalNum);
                inputNum = totalNum;
            }
        }
        return result;
    }
}
