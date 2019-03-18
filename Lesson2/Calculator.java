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
                if (secondNumber == 0) {
                    result = 1;
                } else {
                    result = firstNumber;
                    int i = secondNumber;
                    while (i > 1) {
                        result *= firstNumber;
                        i--;
                    }
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