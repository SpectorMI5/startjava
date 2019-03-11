public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 34;
        int guessNumber = 50;

        while (guessNumber != hiddenNumber) {
            if (guessNumber > hiddenNumber) {
                System.out.println("Zagadannoe chislo menshe " + guessNumber);
                guessNumber--;
            } else {
                System.out.println("Zagadannoe chislo bolshe " + guessNumber);
                guessNumber++;
            }
        }
        System.out.println(guessNumber + "! Vi ugadali chislo!");
    }
}