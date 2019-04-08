package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scan.nextLine());
        System.out.println("У вас 10 попыток");
        GuessNumber guessNum = new GuessNumber(playerOne, playerTwo);
        String choice;

        do {
            guessNum.guess();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                choice = scan.nextLine();
            } while (!choice.equals("да") && !choice.equals("нет"));
        } while (choice.equals("да"));
    }
}