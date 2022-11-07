package ru.netology.sqr;

public class SQRService {
    public int calcSqr(int x, int y) {
        int total = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= x) {
                if (i * i <= y) {
                    total++;
                }
            }
        }
        return total;
    }
}
