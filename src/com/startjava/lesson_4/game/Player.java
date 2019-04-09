package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int[] getNumbers(int i) {
        return Arrays.copyOf(numbers, i + 1);
    }

    public void setNumbers(int number, int i) {
        numbers[i] = number;
    }
}