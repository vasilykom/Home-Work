package com.devcolibri;
import java.util.Scanner;

/**
 * *
 Написать консольную программу, которая запрашивает у пользователя два числа, складывает их и результат выводит на консоль.
 */
public class javaguru_02_dz_5_summ_of_numbers {
    public static void main(String[] args) {
        int numberFromInput; //  число вводимое пользователем
        int counterNumber;  // счетчик для вывода номера числа
        int summ = 0;

        System.out.println("Программа, которая запрашивает у пользователя два числа, складывает их и результат выводит на консоль.\n");
        for (counterNumber = 0; counterNumber <3; counterNumber++) {
            System.out.print("\t Введите число Nr." + (counterNumber+1) + " : ");
            Scanner in = new Scanner(System.in);
            numberFromInput = in.nextInt();
            summ = summ + numberFromInput;
        }
        System.out.println("\n\t The Total Summ of your numbers is: " + summ);
    }
}
