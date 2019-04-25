package com.lits.javaBase;

public class PrevOdd {
    public void result (int x) {
//        int temp = x/2;
        if (x%2==0) {
            x = x - 1;
//            System.out.println(temp);
        }
        System.out.println("the most odd number, no more entered: "+ x);
    }
}

//    Зчитати ціле число. Вивести у консоль найбільше непарне число, не більше введеного