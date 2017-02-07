package com.devcolibri;

import java.util.Scanner;

/**
 * Created by Vasily on 2/7/2017.
 * Написать консольную программу, которая запрашивает у пользователя три целых числа и выводит на консоль наибольшее из них.
 * Если все числа равны то вывести на консоль текст "A == B == С".
 */
public class javaguru_03_dz_3_compare_3_numbers {
    public static void main(String[] args) {
        System.out.println("Программп, которая запрашивает у пользователя три целых числа и выводит на консоль наибольшее из них.\n");

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Введите число А: ");
        int numberA = inputUser.nextInt();

        System.out.print("Введите число B: ");
        int numberB = inputUser.nextInt();

        System.out.print("Введите число C: ");
        int numberC = inputUser.nextInt();

        if (numberA == numberB && numberB == numberC) {
            System.out.println("Все числа равны: A = B = С = " + numberA);

        } else if(numberA == numberB && numberA > numberC) {
            System.out.println("Наибольшие числа: A = B = " + numberA);
        } else if (numberA < numberB && numberB == numberC) {
            System.out.println("Наибольшие числа: B = C = " + numberB);
        } else if( numberA == numberC && numberB < numberC) {
            System.out.println("Наибольшие числа: A = C = " + numberA);

        } else if (numberA > numberB && numberA> numberC) {
            System.out.println("Наибольшие числo: A = " + numberA);
        } else if (numberB>numberA && numberB > numberC) {
            System.out.println("Наибольшие числo: B = " + numberB);
        } else {
            System.out.println("Наибольшие числo: C = " + numberC);
        }
    }
}

