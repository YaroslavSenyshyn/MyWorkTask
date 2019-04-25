package com.lits.javaBase;

public class CallCost {
    public void result(int phoneNumber, int quantityMin) {

        if (phoneNumber > 99 & phoneNumber < 1000) {
            if (phoneNumber >= 101 && phoneNumber <= 104 || phoneNumber == 112) {
                System.out.println("Free call");
            } else System.out.println("call cost: " + (quantityMin * 40) + "$");
        } else if (phoneNumber >= 1000000 && phoneNumber <= 9999999) {
            System.out.println("call cost: " + (quantityMin * 1) + "$");
        } else System.out.println("-1");


    }

}

//        Зчитати з клавіатури 2 цілі числа - номер телефону та кількість хвилин.
//        Вартість однієї хвилини розмови складає 1$ за дзвінок на міський номер та 40$ за дзвінок на короткий номер.
//        Дзвінки на номери спеціальних служб безкоштовні. У випадку невизначеності вивести -1.
//Пояснення
//        Коротким номером вважається будь-який тризначний номер
//        Міським номером вважається будь-який семизначний номер.
//        Номери телефонів не можуть починатися з нуля.
//        Номери спецслужб: 101, 102, 103, 104, 112.

