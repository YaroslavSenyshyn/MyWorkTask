package com.lits.javaBase;

public class IsLeap {
    public void result(int a) {
        if (a == 366 || a == 365) {
            if (a == 366) {
                System.out.println("Yes");
            } else System.out.println("No");
        } else System.out.println("Invalid param");
    }
}

//        Зчитати з клавіатури кількість днів. Якщо ця величина рівна 366 вивести «yes»,
//        якщо величина рівна 365 - вивести «no».
//        В інших випадках вивести у консоль «Invalid param»
