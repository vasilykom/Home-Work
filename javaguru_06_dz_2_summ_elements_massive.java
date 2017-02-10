package com.devcolibri;

import java.util.Random;

/**
 * Написать консольную программу, в которой нужно:
 1) создать массив целых чисел длиной 10 элементов
 2) заполнить массив случайными числами
 3) вывести его на консоль
 4) посчитать сумму чисел в массиве

 * Created by Vasily on 2/10/2017.
 */
public class javaguru_06_dz_2_summ_elements_massive {
    static int[] nums = new int[10];

    public static void main(String[] args) {
        System.out.println("Программа, в которой нужно создать массив целых чисел длиной 10 элементов, " +
                "заполнить массив случайными числами и вывести его на консоль.\n");
        Random generatorRandom= new Random();
        int summ=0;

        for (int i=0; i<nums.length; i++) {

            nums[i] = generatorRandom.nextInt(101);
            System.out.println("Число массива Nr." + (i + 1) + " = " + nums[i]);

            summ = nums[i] + summ;
        }
            System.out.println("\nCумма элементов массива="+summ);
    }
}

