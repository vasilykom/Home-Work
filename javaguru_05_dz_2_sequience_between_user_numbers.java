package com.devcolibri;
import java.util.Scanner;

/**
 * Created by Vasily on 2/8/2017.
 * Написать консольную программу, которая запрашивает у пользователя два числа.
 Если первое число меньше второго то при помощи цикла while
 вывести на консоль числа от первого до второго.
 */
public class javaguru_05_dz_2_sequience_between_user_numbers {
    public static void main(String[] args) {
        System.out.println("Программа выводит числа от первого числа до второго," +
                "если первое число меньше второго.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (a < b) {
            int summ = a;
            while (summ != b){
                System.out.println(summ);
                summ++;
            }

        } else if (a >= b ) {
            System.out.println("\nПервое число больше второго. Перезапустите программу.");
        }
    }
}
