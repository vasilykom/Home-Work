package com.devcolibri;

/**
 * Написать консольную программу, которая при помощи цикла while печатает на консоли числа от 0 до 100.
 * Created by Vasily on 2/8/2017.
 */
public class javaguru_05_dz_1_sequience_by_operator_while {
    public static void main(String[] args) {
        System.out.println("Программа, которая при помощи цикла while печатает на консоли числа от 0 до 100.");

        int startNumber=0;
        int endNumber=100;

        int summ=startNumber;

        // Nr.1
        System.out.println("Do-while operator in use");
        do{

            System.out.println(summ);
            summ++;
        } while (summ != endNumber );

        // Nr.2
        System.out.println("while only operator in use");
        summ= startNumber;
        while ( summ != endNumber) {
            System.out.println(summ);
            summ++;
        }
    }
}
// do we need to print out 100 or 99 is enought?

