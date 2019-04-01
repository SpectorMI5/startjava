package com.startjava.lesson_1.cycle;

public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        int i = 6;
        while (i >= -6) {
            System.out.print(i + " ");
            i -= 2;
        }

        i = 10;
        int sum = 0;
        do {
            if (i % 2 == 1) {
                sum += i;
            }
            i++;
        } while (i < 20);
        System.out.print("\n" + sum);
    }
}