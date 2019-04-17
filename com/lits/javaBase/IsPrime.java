package com.lits.javaBase;

public class IsPrime {
    public boolean result(int a) {
        boolean check = true;
        for (int i = 2; i <= (a / 2); i++) {
            if (a % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}

//    Написати функцію і використати її в коді
//    public static boolean isPrime(int n) { // your code }
//    Функція повинна перевіряти, чи є введене число простим