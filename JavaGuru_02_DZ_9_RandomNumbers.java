package com.devcolibri;
import java.util.Random;
/**
 * Написать консольную программу, которая генерит 3 случайных числа в диапазоне от 0 до 100,
 выводит их на консоль и подсчитывает их сумму.
 */
public class JavaGuru_02_DZ_9_RandomNumbers {
    public static void main(String[] args) {

        System.out.println("Программа, которая генерит 3 случайных числа в диапазоне от 0 до 100, выводит их на консоль и подсчитывает их сумму.\n");
        int summ = 0; //

        for ( int i = 0; i < 3 ; i++ ) {
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(100);
            System.out.println(" Случайное число Nr." + (i)+1 + " = " + randomNumber);
            summ = summ + randomNumber;
        }
        System.out.println("\n\t Сумма случайных чисел равна: " + summ);
    }
}
