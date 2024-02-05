package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputData();

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = getRandom(18,59);
            System.out.println(arr[i]);
        }

    }

    private static int getRandom(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max-min)+min);
    }
    private static void inputData() {
        // int, double, float, char, boolean,
        System.out.println("> enter your name:");
        String name;

        Scanner scanner = new Scanner(System.in); // вхідний потік
        name = scanner.nextLine(); // console.ReadLine() c#
        System.out.println("Hello, " + name);
    }
}