public class Player {

    public Player(String name) {
        this.name = name;
    }

    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}