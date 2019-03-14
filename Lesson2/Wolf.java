public class Wolf {

    String gender;
    String nickname;
    int weight;
    int age;
    String colour;

    void go() {
        System.out.println("Wolf walked 10 meters");
    }

    void sit() {
        System.out.println("Wolf sat down");
    }

    void run() {
        System.out.println("Wolf ran 20 meters");
    }

    void howl() {
        System.out.println("UU-UU-UU");
    }

    boolean hunt() {
        System.out.println("Wolf got prey");
        return true;
    }
}