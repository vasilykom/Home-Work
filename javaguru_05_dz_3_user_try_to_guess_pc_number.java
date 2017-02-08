package com.devcolibri;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Vasily on 2/8/2017.
 * Загадайка - загадывает

 1. Программа загадывает число от 1 до 100 случайным образом.
 2. Пользователь вводит число. Программа отвечает, было ли это число больше,меньше или равно загаданному.
 3. Если число не отгадано, переход к шагу 2.

 */
public class javaguru_05_dz_3_user_try_to_guess_pc_number {
    public static void main(String[] args) {

        System.out.println("Программа загадывает число от 1 до 100 случайным образом.\n" +
                "Пользователь вводит число. " +
                "Программа отвечает, было ли это число больше,меньше или равно загаданному.\n");
        Random randomNumber = new Random();
        int pcNumber = randomNumber.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int userNumber;

        do {
            System.out.println("Введите число: ");
            userNumber = scanner.nextInt();

            if (pcNumber < userNumber){
                System.out.println("ваше число больше загаданного!");
            } else if (pcNumber > userNumber){
                System.out.println("ваше число меньше загаданного!");
            }
        } while (pcNumber != userNumber);
        System.out.println("Да, вы угадали!!!");
    }
}
