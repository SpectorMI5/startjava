package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        String choice;
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Введите математическое выражение: ");
            calc.setMathExpression(scan.nextLine());
            calc.calculate();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                choice = scan.nextLine();
            } while (!choice.equals("да") && !choice.equals("нет"));
        } while (choice.equals("да"));
    }
}