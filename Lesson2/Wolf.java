public class Wolf {

    private String gender;
    private String nickname;
    private int weight;
    private int age;
    private String colour;

    public String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age > 8) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }

    public String getColour() {
        return colour;
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    public void go() {
        System.out.println("Wolf walked 10 meters");
    }

    public void sit() {
        System.out.println("Wolf sat down");
    }

    public void run() {
        System.out.println("Wolf ran 20 meters");
    }

    public void howl() {
        System.out.println("UU-UU-UU");
    }

    public boolean hunt() {
        System.out.println("Wolf got prey");
        return true;
    }
}