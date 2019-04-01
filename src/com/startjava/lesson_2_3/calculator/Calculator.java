package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private int result;
    private String sign;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void calculate() {
        switch (sign.toLowerCase()) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "^":
                result = 1;
                int i = secondNumber;
                while (i > 0) {
                    result *= firstNumber;
                    i--;
                }
                break;
            case "%":
                result = firstNumber % secondNumber;
                break;
            default:
                break;
        }
        System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
    }
}