package com.devcolibri;

import java.util.Scanner;

/**
 * Created by Vasily on 2/9/2017.
 */
public class javaguru_05_dz_4_pc_tries_to_guess_your_number {
    public static void main(String[] args) {
        System.out.println("Программа угадывает вами загаданное число от 0 до 100");
        System.out.print("(Введите подсказку: d=меньше/ u=больше/ yes=угадал!) \n\n");
        String answer;
        int a=0;
        int b=100;
        int c;

        do {
            System.out.print("Ваше число возможно равно: "+(a+b)+" ? : ");

            Scanner in = new Scanner(System.in);
            answer = in.nextLine().trim().toLowerCase();
            c=Math.abs((a+b)/2);

            if (answer.equals("u")) {
                a=c;
            } else if (answer.equals("d")) {
                b=c;
            } else if(answer.equals("yes")){
                System.out.println("\nЗагаданное Вами число равно: " + (a+b)+"!!!");
                break;
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
            }
        } while(true);
    }
}
