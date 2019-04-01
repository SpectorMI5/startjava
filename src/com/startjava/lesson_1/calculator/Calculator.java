package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 2;
        int result;
        char sign = '+';

        if (sign == '+') {
            result = firstNumber + secondNumber;
        } else if (sign == '-') {
            result = firstNumber - secondNumber;
        } else if (sign == '*') {
            result = firstNumber * secondNumber;
        } else if (sign == '/') {
            result = firstNumber / secondNumber;
        } else if (sign == '^') {
            result = firstNumber;
            int i = secondNumber;
            while (i > 1) {
                result *= firstNumber;
                i--;
            }
        } else {
            result = firstNumber % secondNumber;
        }
        System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
    }
}