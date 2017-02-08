package com.devcolibri;

import java.util.Scanner;

/*
Написать консольную программу, которая запрашивает у пользователя два целых числа и если первое число меньше второго,
 то считает сумму целых чисел от первого до второго включительно.

Решить эту задачу двумя способами:
 1) используя цикл
 2) ...
 */
public class javaguru_04_dz_4_summ_of_sequience {
    public static void main(String[] args) {
        int s = 0;

        System.out.println("Программа, которая запрашивает у пользователя два целых числа и если первое число меньше второго," +
                " \nто считает сумму целых чисел от первого до второго включительно.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.println("\n(1-й способ подсчета суммы)");
        if (a < b) {
            System.out.println("Первое число меньше второго. " +
                    "\nСумма чисел от первого до второго равна: ");
            for (int i = a; i <= b; i++) {
                s = s + i;
            }
            System.out.println(s);
        }

        System.out.println("\n(2-й способ подсчета суммы)");
        if (a < b) {
            System.out.println("Первое число меньше второго. " +
                    "\nСумма чисел от первого до второго равна: ");
            for (int i = b; i == a; i--) {
                s = s + i;
            }
            System.out.print(s);
        } else if (a >= b) {
            System.out.println("\nПервое число больше второго. Перезапустите программу.");
        }


    }
}

