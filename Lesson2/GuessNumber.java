import java.util.Scanner;

public class GuessNumber {

    private String playerName;
    private int hiddenNumber;
    private int playerNumber;
    Scanner scanNumber = new Scanner(System.in);

    public int getHiddenNumber() {
        return hiddenNumber;
    }

    public void setHiddenNumber() {
        hiddenNumber = (int)(Math.random() * 101);
        //System.out.println(hiddenNumber);
        playerNumber = 101;     //Если загаданное число будет тем же, что и в прошлый раз, это присвоение исправит случаи пропуска ходов
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int inputNumber(String playerName) {
        if (this.playerNumber != hiddenNumber) {    //Если предыдущий игрок уже угадал число, то пропускаем ввод числа для следующего
            this.playerName = playerName;
            System.out.print(playerName + " guess number: ");
            return scanNumber.nextInt();
        } else {
            return 0;
        }
    }

    public void numberСomparison(int playerNumber) {
        if (this.playerNumber != hiddenNumber) {    //Если предыдущий игрок уже угадал число, то пропускаем сравнение для следующего
            this.playerNumber = playerNumber;
            if (playerNumber > hiddenNumber) {
                System.out.println("Hidden number less than " + playerNumber);
            } else if (playerNumber < hiddenNumber) {
                System.out.println("Hidden number greater than " + playerNumber);
            } else {
                System.out.println(playerName + " guessed right hidden number!");
            }
        }
    }
}