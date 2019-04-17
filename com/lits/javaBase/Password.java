package com.lits.javaBase;

import java.util.Scanner;

public class Password {
    public void result(Scanner sc) {
        int x = 1488;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Pleas input password");
            int y = sc.nextInt();
            if (y != x) {
                System.err.println("incorrect password");
                if (i == 5) {
                    System.err.println("denied");
                    break;
                }
            } else if (y == x) {
                System.out.println("accepted");
                break;
            }
        }
    }
}

//        Зчитати з клавіатури пароль. Якщо пароль співпадає з 1488, вивести у консоль "accepted",
//        інакше - "incorrect password". Після п'яти невдалих спроб вивести "denied".
//
//        Приклад використання:
//        <вводите число, яке не є паролем>
//        incorrect password
//        <вводите число, яке не є паролем>
//        incorrect password
//        <вводите число, яке не є паролем>
//        incorrect password
//        <вводите число, яке не є паролем>
//        incorrect password
//        <вводите число, яке не є паролем>
//        incorrect password
//        denied
