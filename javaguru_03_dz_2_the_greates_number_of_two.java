package com.devcolibri;
import java.util.Scanner;
/**
 * Created by Vasily on 2/7/2017.
 * Написать консольную программу, которая запрашивает у пользователя два целых числа и выводит на консоль наибольшее из них.
 * Если числа равны то вывести на консоль текст "A == B".
 */
public class javaguru_03_dz_2_the_greates_number_of_two {
    public static void main(String[] args) {

        System.out.println("Программа, которая запрашивает у пользователя два целых числа и выводит на консоль наибольшее из них.\n");
        int userNumberA;
        int userNumberB;

        Scanner scanner = new Scanner(System.in);

            System.out.print("Введите число А: ");
            userNumberA = scanner.nextInt();

        System.out.print("Введите число B: ");
        userNumberB = scanner.nextInt();

        if (userNumberA > userNumberB){
            System.out.println("Число A больше чем В, А = " + userNumberA);
        } else if (userNumberA < userNumberB){
            System.out.println("Число B больше чем A, B = " + userNumberB);
        } else {
            System.out.println("A = B = "+ userNumberA);
        }
    }
}
