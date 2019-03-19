import java.util.Scanner;

public class GuessNumber {

    public GuessNumber(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    private String firstPlayerName;
    private String secondPlayerName;
    private int hiddenNumber;
    private int firstPlayerNumber;
    private int secondPlayerNumber;
    Scanner scanNumber = new Scanner(System.in);

    public void guess() {
        hiddenNumber = (int)(Math.random() * 101);
        System.out.println(hiddenNumber);
        do {
            System.out.print("First player guess number: ");
            firstPlayerNumber = scanNumber.nextInt();
            if (firstPlayerNumber > hiddenNumber) {
                System.out.println("Hidden number less than " + firstPlayerNumber);
            } else if (firstPlayerNumber < hiddenNumber) {
                System.out.println("Hidden number greater than " + firstPlayerNumber);
            } else {
                System.out.println(firstPlayerName + " guessed right hidden number!");
                break;
            }

            System.out.print("Second player guess number: ");
            secondPlayerNumber = scanNumber.nextInt();
            if (secondPlayerNumber > hiddenNumber) {
                System.out.println("Hidden number less than " + secondPlayerNumber);
            } else if(secondPlayerNumber < hiddenNumber) {
                System.out.println("Hidden number greater than " + secondPlayerNumber);
            } else {
                System.out.println(secondPlayerName + " guessed right hidden number!");
                break;
            }
        } while(firstPlayerNumber != hiddenNumber && secondPlayerNumber != hiddenNumber);
    }
}