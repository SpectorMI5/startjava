package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Coyote Tango");
        jaegerOne.setMark("Mark-1");
        jaegerOne.setHeight(85.34f);
        jaegerOne.setWeight(2312);
        jaegerOne.setSpeed(5);
        jaegerOne.setStrength(7);
        jaegerOne.setArmor(4);

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Striker Eureka");
        jaegerTwo.setMark("Mark-5");
        jaegerTwo.setHeight(76.2f);
        jaegerTwo.setWeight(1850);
        jaegerTwo.setSpeed(10);
        jaegerTwo.setStrength(10);
        jaegerTwo.setArmor(9);

        System.out.println("Model name: " + jaegerOne.getModelName());
        System.out.println("Mark: " + jaegerOne.getMark());
        System.out.println("Height: " + jaegerOne.getHeight() + " m");
        System.out.println("Weight: " + jaegerOne.getWeight() + " tons");
        System.out.println("Speed: " + jaegerOne.getSpeed());
        System.out.println("Strength: " + jaegerOne.getStrength());
        System.out.println("Armor: " + jaegerOne.getArmor() + "\n");

        System.out.println("Model name: " + jaegerTwo.getModelName());
        System.out.println("Mark: " + jaegerTwo.getMark());
        System.out.println("Height: " + jaegerTwo.getHeight() + " m");
        System.out.println("Weight: " + jaegerTwo.getWeight() + " tons");
        System.out.println("Speed: " + jaegerTwo.getSpeed());
        System.out.println("Strength: " + jaegerTwo.getStrength());
        System.out.println("Armor: " + jaegerTwo.getArmor() + "\n");

        jaegerOne.move();
        jaegerOne.scanKaiju();
        jaegerOne.run();
        jaegerTwo.move();
        jaegerTwo.scanKaiju();
        jaegerTwo.run();

        jaegerOne.setWeight(2174);
        System.out.println("\nWeight: " + jaegerOne.getWeight() + " tons");
        jaegerOne.setSpeed(6);
        jaegerOne.move();
        jaegerTwo.setModelName("Defender Eureka");
        System.out.println("Model name: " + jaegerTwo.getModelName());
        jaegerTwo.setHeight(81.62f);
        System.out.println("Height: " + jaegerTwo.getHeight() + " m");
    }
}