package com.devcolibri;
import java.util.Random;

/**
 * Написать консольную программу, в которой нужно:
 1) создать массив целых чисел длиной 10 элементов
 2) заполнить массив случайными числами
 3) вывести его на консоль
 4) отсортировать массив методом пузырьковой сортировки
 5) вывести отсортированный массив на консоль
 * Created by Vasily on 2/10/2017.
 */
public class javaguru_06_dz_6_array_bubble_sort {
    static int [] nums= new int [10];
    public static void main(String[] args) {
        Random generatorRandom = new Random();
        //System.out.println(nums.length);
        int greatestElement=0;//
        int nomerElementa=0;
        int memoryTemp=0;

        for (int i=0; i<nums.length; i++) {
            nums[i] = generatorRandom.nextInt(100);

            System.out.println("Число элемента массива Nr." + (i) + " =" + nums[i]);

        }
        System.out.println("\nNr.Сортировка элементов массива методом пузырьковой сортировки.");

        for (int j=nums.length;j>1;j--) {
            for (int i=0; i<j-1; i++) {
                if (nums[i]>nums[i+1]){
                    memoryTemp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=memoryTemp;
                }
            }
        }
        for (int i=0; i<nums.length; i++) {
            System.out.println("Число элемента массива Nr." + (i) + " =" + nums[i]);
        }
    }
}
