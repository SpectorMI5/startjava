import java.util.Scanner;

public class GuessNumberTest {

    private static String choice;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first player name: ");
        Player playerOne = new Player(scan.nextLine());
        System.out.print("Enter second player name: ");
        Player playerTwo = new Player(scan.nextLine());
        GuessNumber guessNum = new GuessNumber(playerOne, playerTwo);

        do {
            guessNum.guess();
            do {
                System.out.print("Want to continue? [yes/no]: ");
                choice = scan.nextLine();
            } while (!choice.equals("yes") && !choice.equals("no"));
        } while (choice.equals("yes"));
    }
}