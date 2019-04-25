package com.lits.javaBase;

public class NextOdd {
    public void result (int a) {
        if (a%2 == 0) {
            System.out.println("The least number of odd and not less than entered : "+(a+1));
        } else System.out.println("The least number of odd and not less than entered : "+a);
    }
}

//    Зчитати з клавіатури ціле число. Вивести у консоль найменше непарне число, не менше введеного.