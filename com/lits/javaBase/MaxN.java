package com.lits.javaBase;

import java.util.Scanner;

public class MaxN {
    public void result (int a, Scanner sc) {
        int max = 0;
        for (int i = 0; i < a; i++) {
            int temp = sc.nextInt();
            if (max < temp) max = temp;

        }
        System.out.println(max);
    }
}

//        Зчитати з клавіатури ціле додаткове число - кількість чисел у послідовності.
//        Потім ввести задану кількість чисел та вивести найбільше з них.