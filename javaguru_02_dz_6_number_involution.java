package com.devcolibri;
import java.util.Scanner;
/**
 Написать консольную программу, которая запрашивает у пользователя целое число, возводит его в степень и результат выводит на консоль.
 */
public class javaguru_02_dz_6_number_involution {
    public static void main(String[] args) {
        int userNumber; // число, которое нужно возвести в степень
        int x; // степень
        System.out.print("Это программа, которая запрашивает у пользователя целое число, возводит его во вторую степень и результат выводит на консоль.\n\n");

        System.out.print("\t Введите число:");
        Scanner in = new Scanner(System.in);
        userNumber = in.nextInt();

        System.out.print("\t Введите степень числа:");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        System.out.println("\n\t Число " + userNumber + " возведенное в степень " + x + " равно: " + Math.pow(userNumber,x));
    }
}

// как получить челое число без запятой?