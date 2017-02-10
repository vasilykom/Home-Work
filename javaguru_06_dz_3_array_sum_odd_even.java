package com.devcolibri;

import java.util.Random;

/**
 * Написать консольную программу, в которой нужно:

 1) создать массив целых чисел длиной 10 элементов
 2) заполнить массив случайными числами
 3) вывести его на консоль
 4) посчитать количество чётных и не чётных чисел в массиве

 * Created by Vasily on 2/10/2017.
 */
public class javaguru_06_dz_3_array_sum_odd_even {
    static int [] nums = new int [10];
    public static void main(String[] args) {
        Random generatorRandom = new Random();

        int sum0=0;
        int sum1=0; //

        for (int i=0; i<nums.length; i++) {
            nums[i] = generatorRandom.nextInt(100);
            if (nums[i]%2==1){
                sum1++;
            } else if(nums[i]%2==0){
                sum0++;
            }
            System.out.println("Число массива Nr."+(i+1)+" =" + nums[i]);
        }

        System.out.println("\nНечетные Числа количество:" + sum1);
        System.out.println("Четные Числа количество:" + sum0);
    }
}
