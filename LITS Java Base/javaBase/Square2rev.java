package com.lits.javaBase;

public class Square2rev {
    public void result(int total) {
//        int temp = total*total;
//        for (int i = 0; i < total; i++) {
//            for (int j = 0; j < total; j++) {
//                System.out.print((temp--)+" ");
//            }
//            System.out.println();
//        }
        int x = 1;
        for (int row = total; row > 0; row--) {
            int temp = total * total - x * total;
            for (int col = 1; col < total; col++) {
                System.out.print((++temp) + " ");
            }
            x++;
            System.out.println((++temp) + " ");
        }
    }
}
//}

//        Вивести у консоль квадрат із чисел заданого розміру
//        Виведені числа починаються з одиниці та постійно збільшуються..
//        У кожному рядку числа розділені пробілом
//        Рядки мають зворотній характер
//        Розмір квадрату зчитати з клавіатури