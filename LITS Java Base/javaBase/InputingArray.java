package com.lits.javaBase;

import java.util.Scanner;

public class InputingArray {
    public static void input(int[] array, Scanner sc) {
        System.out.println("Input array value");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }
}
