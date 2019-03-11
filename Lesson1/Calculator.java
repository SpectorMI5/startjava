public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 2;
        int result;
        char operationMark = '+';

        if (operationMark == '+') {
            result = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + result);
        } else if (operationMark == '-') {
            result = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + result);
        } else if (operationMark == '*') {
            result = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        } else if (operationMark == '/') {
            result = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + result);
        } else if (operationMark == '^') {
            result = firstNumber;
            int i = secondNumber;
            while (i > 1) {
                result = result * firstNumber;
                i--;
            }
            System.out.println(firstNumber + " v stepeni " + secondNumber + " = " + result);
        } else {
            result = firstNumber % secondNumber;
            System.out.println("Ostatok ot deleniya " + firstNumber + " na " + secondNumber + " = " + result);
        }
    }
}