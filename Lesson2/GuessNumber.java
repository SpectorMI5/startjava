public class GuessNumber {

    private int guessNumber;
    private int hiddenNumber;

    public int getGuessNumber() {
        return guessNumber;
    }

    public void setGuessNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    public int getHiddenNumber() {
        return hiddenNumber;
    }

    public void setHiddenNumber(int hiddenNumber) {
        this.hiddenNumber = hiddenNumber;
    }

    public void guess() {
        if (guessNumber > hiddenNumber) {
            System.out.println("Hidden number less than " + guessNumber);
        } else if (guessNumber < hiddenNumber) {
            System.out.println("Hidden number greater than " + guessNumber);
        } else {

        }
    }
}