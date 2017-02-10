package com.devcolibri;
import java.util.Random;

/**
 * Написать консольную программу, в которой нужно:
 1) создать массив целых чисел длиной 10 элементов
 2) заполнить массив случайными числами
 3) вывести его на консоль
 4) найти в массиве наибольшее число и вывести его на консоль
 * Created by Vasily on 2/10/2017.
 */

public class javaguru_06_dz_4_array_greatest_number {
    static int [] nums = new int [10];
    public static void main(String[] args) {
        Random generatorRandom = new Random();

        int greatestNumber=0;//

        for (int i=0; i<nums.length; i++) {
            nums[i] = generatorRandom.nextInt(100);
            if (nums[i]>greatestNumber) {
                greatestNumber = nums[i];
            }
            System.out.println("Число массива Nr."+(i+1)+" =" + nums[i]);
        }
        System.out.println("\nНаибольшее число массива:" +greatestNumber);
    }
}
