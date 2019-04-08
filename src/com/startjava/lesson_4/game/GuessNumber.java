package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private int hiddenNumber;
    private int attempt;    //попытки
    private boolean isGuessNumber;      //отгадано число или нет
    Scanner scanNumber = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void guess() {
        generateHiddenNumber();

        for (attempt = 0; attempt < 10; attempt++) {
            inputPlayerNumber(playerOne);
            compareNumbers(playerOne);
            if (playerOne.getNumber() == hiddenNumber) {
                break;
            }

            inputPlayerNumber(playerTwo);
            compareNumbers(playerTwo);
            if (playerTwo.getNumber() == hiddenNumber) {
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
        }
        if (attempt == 9 && player.getNumber() != hiddenNumber) {   //если попытки закончились, то выводим сообщение
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void outputNumbers (Player player) {
        int[] playerNumbers = Arrays.copyOf(player.getNumbers(), (attempt + 1));
        if (player.getNumber() == hiddenNumber) {
            attempt--;
            isGuessNumber = true;
        }
        System.out.println(Arrays.toString(playerNumbers));     //выводим все попытки игрока
    }

    private void fillNumbers (Player player) {
        if (isGuessNumber) {    //условие, чтобы не было выхода за пределы массива, в случае если attempt = 9
            Arrays.fill(player.getNumbers(), 0, attempt + 1, 0);
        } else {
            Arrays.fill(player.getNumbers(), 0);
        }
    }
}