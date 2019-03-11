public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 34;
        int guessNumber = 50;

        while (guessNumber != hiddenNumber) {
            if (guessNumber > hiddenNumber) {
                System.out.println("Hidden number less than " + guessNumber);
                guessNumber--;
            } else {
                System.out.println("Hidden number greater than " + guessNumber);
                guessNumber++;
            }
        }
        System.out.println(guessNumber + "! You guessed the number!");
    }
}