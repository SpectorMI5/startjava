public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("male");
        wolfOne.setNickname("Fang");
        wolfOne.setWeight(40);
        wolfOne.setAge(7);
        wolfOne.setColour("gray");

        System.out.println("gender: " + wolfOne.getGender());
        System.out.println("nickname: " + wolfOne.getNickname());
        System.out.println("weight = " + wolfOne.getWeight());
        System.out.println("age = " + wolfOne.getAge());
        System.out.println("colour: " + wolfOne.getColour());

        System.out.println();
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        System.out.println(wolfOne.hunt());
    }
}