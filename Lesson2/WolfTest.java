public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "male";
        wolfOne.nickname = "Fang";
        wolfOne.weight = 40;
        wolfOne.age = 7;
        wolfOne.colour = "gray";

        System.out.println("gender: " + wolfOne.gender);
        System.out.println("nickname: " + wolfOne.nickname);
        System.out.println("weight = " + wolfOne.weight);
        System.out.println("age = " + wolfOne.age);
        System.out.println("colour: " + wolfOne.colour);
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        System.out.println(wolfOne.hunt());
    }
}