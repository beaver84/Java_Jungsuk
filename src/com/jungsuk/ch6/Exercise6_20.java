package com.jungsuk.ch6;

import java.util.Random;

class Exercise6_20
{
    public static int[] shuffle(int[] arr){

        Random rand = new Random();
        int a = 0;
        int b = 0;
        int temp = 0;

        for(int i = 0; i < arr.length; i++){
            a = rand.nextInt(9);
            b = rand.nextInt(9);
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        return arr;
    }


    public static void main(String[] args)
    {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}