package edu.citadel.csci202.archive._01_10_2018;

import java.util.Scanner;

public class ListAverage {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int currValue;
        int valuesSum;
        int numValues;
        int i;

        numValues = scanner.nextInt();

        valuesSum = 0;

        for (i = 0; i < numValues; ++i) {
            currValue = scanner.nextInt();
            valuesSum += currValue;
        }

        System.out.println("Average: " + (valuesSum / numValues));
    }
}