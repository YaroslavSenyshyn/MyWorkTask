package com.lits.javaBase;

public class NextEven {
    public void result (int a) {
        if (a%2 == 1) {
            System.out.println("The least number of even and not less than entered : "+(a+1));
        } else System.out.println("The least number of even and not less than entered : "+a);
    }
}

//    Зчитати з клавіатури ціле число. Вивести у консоль найменше парне число, не менше введеного.