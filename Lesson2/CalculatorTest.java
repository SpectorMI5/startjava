import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String choice;
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Print first number: ");
            calc.setFirstNumber(scan.nextInt());
            scan.nextLine();
            System.out.print("Print sign of operation [+ - * / ^ %]: ");
            calc.setSign(scan.nextLine());
            System.out.print("Print second number: ");
            calc.setSecondNumber(scan.nextInt());
            scan.nextLine();
            calc.calculate();
            do {
                System.out.print("Want to continue? [yes/no]: ");
                choice = scan.nextLine();
                if (choice.equals("yes")) {
                    break;
                } else if (choice.equals("no")) {
                    break;
                } else {

                }
            } while (1 == 1);
        } while (choice.equals("yes"));
    }
}