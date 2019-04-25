package com.lits.javaBase;

public class Base {
    public void result(int number, int system) {
        int temp1 = 1;
        int maxResultStepin = 10;
        int maxStepin = 0;
        int tempForMinus = number;
        int numberForOutput = 1;
        int tempStepin = 0;
        int tempZminna = 0;
        int result = 0;

        for (int cykl = 1; number > temp1; cykl++) {
            temp1 = temp1 * system;
            if (temp1 > number) {
                break;
            }
            maxResultStepin = temp1;
            maxStepin = cykl;
        }
        first:
        for (int temp = maxResultStepin; temp >= 1; temp = (temp / system)) {
            tempForMinus = tempForMinus - tempStepin;

            for (int tempNext = 0; tempForMinus >= (temp * tempNext); tempNext++) {
                tempZminna = temp * tempNext;
                if (tempZminna > tempForMinus) {
                    continue first;
                }
                tempStepin = tempZminna;
                numberForOutput = tempNext;
            }
            if (numberForOutput >= 1) {
                result = result + numberForOutput;
                result = result * 10;
            } else {
                result = result * 10;
            }
        }
        result = result / 10;
        System.out.println(result);
    }
}
//        Зчитати з клавіатури ціле додатнє число в десятковій системі числення
//        та основу нової системи числення (ціле число від 2 до 10).
//        Вивести у консоль число, записане у новій системі числення.
//        Заборонено використовувати масиви
