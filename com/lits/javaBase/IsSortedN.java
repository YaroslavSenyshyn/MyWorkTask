package com.lits.javaBase;

import java.util.Scanner;

public class IsSortedN {
    public void result (int a, Scanner sc) {
        int first = 1;
        boolean logic = true;
        for (int i = 0; i < a; i++) {
            int temp = sc.nextInt();
            if (i == 0) {
                first = temp;
                continue;
            }
            if (first > temp) {
                logic = false;
            }
            first = temp;
        }
        if (logic == true) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}

//        Зчитати з клавіатури позитивну довжину числової послідовності та саму послідовність.
//        Перевірити, чи впорядкована послідовність за неспаданням.
//        Якщо впорядкована - вивести у консоль «yes», інакше - «no».