package com.devcolibri;

import java.util.Random;

/**
 * Написать консольную программу, в которой нужно:
 1) создать массив целых чисел длиной 10 элементов
 2) заполнить массив случайными числами
 3) вывести его на консоль
 4) найти наибольший элемент массива
 5) поставить наибольший элемент массива первым, поменяв его местами с текущим первым элементом
 * Created by Vasily on 2/10/2017.
 */
public class javaguru_06_dz_5_array_greatest_element_up {
    static int [] nums = new int [10];
    public static void main(String[] args) {
        Random generatorRandom = new Random();

        int greatestElement=0;//
        int nomerElementa=0;

        for (int i=0; i<nums.length; i++) {
            nums[i] = generatorRandom.nextInt(100);
            if (nums[i]>greatestElement) {
                greatestElement = nums[i];
                nomerElementa=i;
            }
            System.out.println("Число элемента массива Nr."+(i+1)+" =" + nums[i]);
        }
        System.out.println("\nНаибольший элемент массива Nr." + (nomerElementa+1)+"\n");

        int memory = nums[(nomerElementa)];
        nums[nomerElementa]=nums[0];
        nums[0]=memory;

        System.out.println("Элементы массива после перемещения наибольшего элемента.\n");
        for (int i=0; i<nums.length; i++) {
            System.out.println("Число элемента массива Nr." + (i + 1) + " =" + nums[i]);
        }
    }
}
