package com.devcolibri;
import java.util.Scanner;
/**
 * Написать консольную программу, которая вычисляет корни квадратного уравнегия при условии, что D (дискриминант) больше или равен нулю.
 */
public class JavaGuru_02_DZ_8_RootsOfQuadraticEquation {
    public static void main(String[] args) {
        int a, b, c, D;

        System.out.println("Программа, которая вычисляет дискриминант квадратного уравнения и выводит его на консоль." +
                "Квадратное уравнение — это уравнение вида ax^2 + bx + c = 0, " +
                "где коэффициенты a, b и c — произвольные числа, причем a ≠ 0. ");
        System.out.println("\n Введите поочередно коэффициенты квадратного уравнения. ");
        Scanner koefA = new Scanner(System.in);

        do {
            System.out.print("\n\t Введите коэффициент A: ");
            a = koefA.nextInt();
            if (a == 0){
                System.out.println("\t Помни условие, что A ≠ 0");
            }
        } while (a == 0);

        System.out.print("\t Введите коэффициент B: ");
        b = koefA.nextInt();
        System.out.print("\t Введите коэффициент С: ");
        c = koefA.nextInt();

        D = b * b - 4 * a * c;

        System.out.println("\n\t Дискриминант квадратного уравнения равен: " + D);

        if (D == 0) {

            System.out.println("\n Корни квадратного уравнения");
            System.out.println("\n\t X1 = X2 = " + (-b)/(2*a));

        } else if (D>0){
            System.out.println("\n Корни квадратного уравнения");
            System.out.println("\n\t X1 = " + ((-b)+Math.sqrt(D))/(2*a));
            System.out.println("\n\t X1 = " + ((-b)-Math.sqrt(D))/(2*a));

        } else {
            System.out.println("\n\t Дискриминант < 0 ");
        }
    }
}