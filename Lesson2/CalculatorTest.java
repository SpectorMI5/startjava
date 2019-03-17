import java.util.Scanner;

public class CalculatorTest {

    static Calculator calc = new Calculator();
    static Scanner scanNumber = new Scanner(System.in);
    static Scanner scanSign = new Scanner(System.in);

    public static void program() {
        System.out.print("Print first number: ");
        calc.setFirstNumber(scanNumber.nextInt());
        System.out.print("Print sign of operation [+ - * / ^ %]: ");
        calc.setSign(scanSign.nextLine());
        System.out.print("Print second number: ");
        calc.setSecondNumber(scanNumber.nextInt());
        calc.calculate();
    }

    public static void main(String[] args) {
        String choice = "yes";
        int i = 1;
        Scanner scanChoice = new Scanner(System.in);

        program();
        while (i == 1) {
            System.out.print("Want to continue? [yes/no]: ");
            choice = scanChoice.nextLine();
            switch (choice.toLowerCase()) {
                case "yes":
                    program();
                    break;
                case "no":
                    i = 0;
                    break;
                default:
                    break;
            }
        }
    }
}