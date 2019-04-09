package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private int hiddenNumber;
    private int attempt;
    private boolean isGuessNumber;
    Scanner scanNumber = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void guess() {
        generateHiddenNumber();

        for (attempt = 0; attempt < 10; attempt++) {
            forCycle(playerOne);
            if (isGuessNumber) {
                break;
            }
            forCycle(playerTwo);
            if (isGuessNumber) {
                break;
            }
            if (attempt == 9) {
                break;      //выходим из цикла, чтобы attempt не стало равно 10
            }
        }

        outputNumbers(playerOne);
        outputNumbers(playerTwo);
        if (isGuessNumber) {
            attempt++;      //увеличиваем attempt, чтобы компенсировать его уменьшение в методе outputNumbers
        }

        fillNumbers(playerOne);
        fillNumbers(playerTwo);
        isGuessNumber = false;
    }

    private void generateHiddenNumber() {
        hiddenNumber = (int)(Math.random() * 101);      //генерируем целое число от 0 до 100
        //System.out.println(hiddenNumber);
    }

    private void forCycle(Player player) {
        inputPlayerNumber(player);
        compareNumbers(player);
    }

    private void inputPlayerNumber(Player player) {
        System.out.print(player.getName() + " отгадывает число: ");
        player.setNumber(scanNumber.nextInt());     //считываем число, которое вводит игрок
        player.setNumbers(player.getNumber(), attempt);     //записываем это число в массив попыток
    }

    private void compareNumbers(Player player) {    //сравниваем загаданное число с числом, которое ввел игрок
        if (player.getNumber() > hiddenNumber) {
            System.out.println("Загаданное число меньше чем " + player.getNumber());
        } else if (player.getNumber() < hiddenNumber) {
            System.out.println("Загаданное число больше чем " + player.getNumber());
        } else {
            System.out.println(player.getName() + " угадал число " + hiddenNumber + " с " + (attempt + 1) + " попытки");
            isGuessNumber = true;
        }
        if (attempt == 9 && player.getNumber() != hiddenNumber) {   //если попытки закончились, то выводим сообщение
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void outputNumbers(Player player) {
        System.out.println(Arrays.toString(player.getNumbers(attempt)));     //выводим все попытки игрока
        if (player.getNumber() == hiddenNumber) {
            attempt--;
        }
    }

    private void fillNumbers (Player player) {
        if (isGuessNumber) {    //условие, чтобы не было выхода за пределы массива, в случае если attempt = 9
            Arrays.fill(player.getNumbers(), 0, attempt + 1, 0);
        } else {
            Arrays.fill(player.getNumbers(), 0);
        }
    }
}