package com.startjava.lesson_4.arrays;

public class TasksOnArraysMain {

    public static void main(String[] args) {

        int[] array1 = {5,-8,12,-15,6,21,-11,4};
        int sumOfPositiveElements = 0;
        int maxElement;
        int sumAllElements = 0;
        int minElement;
        int secondMinElement;

        for(int number : array1) {
            System.out.print(number + " ");
        }

        for(int number : array1) {
            if(number > 0 && number % 2 == 0) {
                sumOfPositiveElements += number;
            }
        }
        System.out.println("\nСумма чётных положительных элементов массива = " + sumOfPositiveElements);

        maxElement = array1[2];
        for (int i = 4; i < array1.length; i += 2) {
            if (array1[i] > maxElement) {
                maxElement = array1[i];
            }
        }
        System.out.println("Максимальный из элементов массива с четным индексом = " + maxElement);

        for(int number : array1) {
            sumAllElements += number;
        }
        System.out.println("Сумма всех элементов массива = " + sumAllElements);
        float avg = (float)sumAllElements / array1.length;
        System.out.println("Среднее арифметическое всех элементов массива = " + avg);

        System.out.print("Элементы массива, которые меньше " + avg + ":");
        for(int number : array1) {
            if(number < avg) {
                System.out.print(" " + number);
            }
        }

        minElement = array1[0];
        for(int number : array1) {
            if(minElement > number) {
                minElement = number;
            }
        }
        System.out.println("\nМинимальный элемент массива = " + minElement);

        secondMinElement = array1[0];
        for(int number : array1) {
            if(number < secondMinElement && number > minElement) {
                secondMinElement = number;
            }
        }
        System.out.println("Второй минимальный элемент массива = " + secondMinElement);
    }
}