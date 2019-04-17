package com.lits.javaBase;

public class PrevEven {
    public void result (int a) {
        if (a%2 == 0) {
            System.out.println("The largest pair number, no more entered: "+ a);
        } else System.out.println("The largest pair number, no more entered: "+(a-1));
    }
}

//    Зчитати з клавіатури ціле число. Вивести у консоль найбільше парне число, не більше введеного.