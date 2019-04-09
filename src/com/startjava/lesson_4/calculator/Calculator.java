package com.startjava.lesson_4.calculator;

public class Calculator {

    private String mathExpression;
    private String[] parts;
    private int firstNumber;
    private int secondNumber;
    private String sign;
    private int result;

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public void calculate() {
        split();
        switch (sign) {
            case "+":
                result = Math.addExact(firstNumber, secondNumber);
                break;
            case "-":
                result = Math.subtractExact(firstNumber, secondNumber);
                break;
            case "*":
                result = Math.multiplyExact(firstNumber, secondNumber);
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "^":
                result = (int) Math.pow(firstNumber, secondNumber);
                break;
            case "%":
                result = firstNumber % secondNumber;
                break;
            default:
                break;
        }
        System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
    }

    private void split() {
        parts = mathExpression.split(" ");
        firstNumber = Integer.parseInt(parts[0]);
        sign = parts[1];
        secondNumber = Integer.parseInt(parts[2]);
    }
}