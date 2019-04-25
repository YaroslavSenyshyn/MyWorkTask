package com.lits.javaBase;

import java.util.Scanner;

public class MinN {
    public void result(int a, Scanner sc) {
        int min = 0;
        for (int i = 0; i < a; i++) {
            int temp = sc.nextInt();
            if (i == 0) min = temp;
            if (temp < min) min = temp;
        }
        System.out.println(min);
    }
}

//        Зчитати з клавіатури ціле додаткове число - кількість чисел у послідовності.
//        Потім ввести задану кількість чисел та вивести найменше з них.
//        Використовувати масиви заборонено.