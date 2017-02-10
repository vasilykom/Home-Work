package com.devcolibri;
import java.util.Random;

/**
 * Написать консольную программу, в которой нужно создать массив целых чисел длиной 10 элементов,
 * заполнить массив случайными числами и вывести его на консоль.
 * Created by Vasily on 2/10/2017.
 */
public class javaguru_06_dz_1_array_of_random_numbers_10 {
    static int[] nums = new int[10];

    public static void main(String[] args) {
        System.out.println("Программа, в которой нужно создать массив целых чисел длиной 10 элементов, " +
                "заполнить массив случайными числами и вывести его на консоль.\n");
        Random generatorRandom= new Random();

        for (int i=0; i<nums.length; i++) {
            nums[i] = generatorRandom.nextInt(101);
            System.out.println("Число массива Nr."+ (i+1)+" = "+ nums[i]);
        }
    }
}
