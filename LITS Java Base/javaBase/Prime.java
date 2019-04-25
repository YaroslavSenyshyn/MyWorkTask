package com.lits.javaBase;

public class Prime {
    public void result(int x) {
        IsPrime isPrime = new IsPrime();
        int counter = 0;
        for (int i = 2; i < x*100; i++) {

            if (isPrime.result(i) == true) {
                counter++;
                if (counter == x) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}

//        Вивести N-не просте число
//        N зчитати з клавіатури
//        Використати раніше написану функцію isPrime()