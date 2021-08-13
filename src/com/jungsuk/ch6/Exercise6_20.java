package com.jungsuk.ch6;

import java.util.Random;

class Exercise6_20
{
    public static int[] shuffle(int[] inputArr){

        Random rand = new Random();
        int a = 0;
        int b = 0;
        int temp = 0;

        for(int i = 0; i < inputArr.length; i++){
            a = rand.nextInt(10);
            b = rand.nextInt(10);
            temp = a;
            a = b;
            b = temp;
            inputArr[a] = a;
            inputArr[b] = b;
        }

        return inputArr;
    }


    public static void main(String[] args)
    {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}