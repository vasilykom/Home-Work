package com.devcolibri;
import java.util.Scanner;
/**
 * Найти и исправить ошибку в примере кода для задания 3.
 */
public class javaguru_03_dz_4_error_check {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        if((firstNumber == secondNumber) && (secondNumber == thirdNumber)) {
            System.out.println("All numbers are equals!");

        } else if ((firstNumber == secondNumber) && (secondNumber>thirdNumber)) {
            System.out.println("The first and the second numbers are equals and the greatest");
        } else if ((firstNumber < secondNumber) && (secondNumber==thirdNumber)) {
            System.out.println("The second and the third numbers are equals and the greatest");
        } else if ((firstNumber > secondNumber) && (firstNumber==thirdNumber)) {
            System.out.println("The first and third numbers are equals and the greatest");

        } else if((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("The first number is the greatest!");
        } else if((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("The second number is the greatest!");
        } else {
            System.out.println("The third number is the greatest!");
        }

    }
}
