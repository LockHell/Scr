package ru.netology.sqr;

import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        System.out.println("Квадраты чисел в заданном диапозоне в количестве" + service.calcSqr(10, 99));
    }
}