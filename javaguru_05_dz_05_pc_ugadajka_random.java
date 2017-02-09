package com.devcolibri;
import java.util.Random;
import java.util.Scanner;

/**
 *  * Угадайка отгадывает

 1. Пользователь загадывает число от 1 до 100.
 2. Программа выводит число. Пользователь отвечает, было ли это число больше,меньше или равно загаданному.
 3. Если число не отгадано, переход к шагу 2.

 Возможны 2 реализации:
 1. Программа стремится сделать минимальное число ходов.
 2. Программа делает случайные ходы.

 В любом случае предполагаем, что пользователь не обманывает программу, т.е. если пользователь на число 50 ответил,
 что загаданное число больше, то программа не должна называть числа меньше 51.
 * Created by Vasily on 2/9/2017.
 */

public class javaguru_05_dz_05_pc_ugadajka_random {
    public static void main(String[] args) {
        System.out.println("Программа угадывает вами загаданное число от 0 до 100");
        System.out.print("(Введите подсказку: d=меньше/ u=больше/ yes=угадал!) \n\n");

        int a=0;
        int b=101;
        int c;
        String answer;

        do {

            Random numberGenerator = new Random();

            int numberRandom = Math.abs(numberGenerator.nextInt(b-a));
            //if (numberRandom==0) {
            //    numberRandom = 1;
            //}

            System.out.println("rand"+numberRandom);
            Scanner scanner = new Scanner(System.in);
            // Ввел единичку воизбежание Random =0
            c= a + numberRandom;
            System.out.print("Ваше число может быть равно:"+ c +"? :");
            answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("d")) {
                b=c;
                System.out.println("b="+b);

            } else if (answer.equals("u")) {
                a=c;
                System.out.println("a="+a);
            } else if (answer.equals("yes")) {
                System.out.println("\nЗагаданное вами число равно " + c +"!!!");
                break;
            } else {
                System.out.println("введите ответ в виде d/u/yes, иначе я не понимаю.");
            }
        }while (true) ;
        }
    }
