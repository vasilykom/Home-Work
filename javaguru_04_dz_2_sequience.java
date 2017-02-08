package com.devcolibri;

import java.util.Scanner;

/**
 * Created by Vasily on 2/8/2017.
 * Написать консольную программу, которая запрашивает у пользователя два числа.
 Если первое число меньше второго то при помощи цикла for
 вывести на консоль числа от первого до второго.
 */
public class javaguru_04_dz_2_sequience {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = scanner.nextInt();

        System.out.print("Inpurt second number: ");
        int b = scanner.nextInt();

        if (a<b){

            System.out.println("First number is the greates. The result is sequence of from smallest to the greates: ");
            for( int i = a; i < b; i++){
                System.out.println(i);
                }

            } else if ( a >= b ) {
            System.out.println("\nSecond number should be bigger than the first number. Please restart the program.");
        }

    }
}
