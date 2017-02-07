package com.devcolibri;
import java.util.Scanner;
/**
 Запросите у пользователя целое число:
 - если оно меньше 0 - вывести сообщение: Число отрицательное
 - если число равно 0 - вывести сообщение: Число равно 0
 - если число больше 0 - вывести сообщение: Число положительное
 */
public class javaguru_03_dz_1_number_check {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа, которая оценивает введенное пользователем число.\n");
        System.out.print("\n\tВведите целое число: ");
        int userNumber = scanner.nextInt();
        if (userNumber < 0){
            System.out.println("\n\tВаше Число отрицательное");
        } else if(userNumber == 0){
            System.out.println("\n\tВаше Число равно 0");
        } else {
            System.out.println("\n\tВаше Число положительное");
        }
    }
}
