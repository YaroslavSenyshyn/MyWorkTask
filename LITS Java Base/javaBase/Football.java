package com.lits.javaBase;

public class Football {
    public void result(int a, int b) {
        if (a > b) {
            System.out.println("Home team wins");
        } else if (b > a) {
            System.out.println("Away team wins");
        } else System.out.println("Draw");
    }
}

//        Зчитати з клавіатури 2 цілі числа- кількість забитих голів господарями та гостями у футбольному матчі.
//        Вивести у консоль результат матчу: «Home team wins», «Away team wins», «Draw».