package com.devcolibri;

import java.util.Scanner;

/**
 * Угадайка отгадывает

 1. Пользователь загадывает число от 1 до 100.
 2. Программа выводит число. Пользователь отвечает, было ли это число больше,меньше или равно загаданному.
 3. Если число не отгадано, переход к шагу 2.

 Возможны 2 реализации:
 1. Программа стремится сделать минимальное число ходов.
 2. Программа делает случайные ходы.

 В любом случае предполагаем, что пользователь не обманывает программу, т.е. если пользователь на число 50 ответил, что загаданное число больше, то программа не должна называть числа меньше 51.

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
        int c1;

        do {
                c = Math.abs((a + b) / 2);
                System.out.print("Ваше число возможно равно: " + c + " ? : ");

            Scanner in = new Scanner(System.in);
            answer = in.nextLine().trim().toLowerCase();

            if (answer.equals("u")) {
                a=c+1;
            } else if (answer.equals("d")) {
                b=c;
            } else if(answer.equals("yes")){
                System.out.println("\nЗагаданное Вами число равно: " + c + "!!!");
                break;
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
            }
        } while(true);
    }
}
