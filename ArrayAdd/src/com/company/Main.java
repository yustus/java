package com.company;
//import java.util.Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

      /*  Object[] arr = {1,2,3};
        Object[] arrToBeAdded = {4,5};

        Object[] appendedArray = append(arr, arrToBeAdded);

        for (int i = 0; i < appendedArray.length; i++) {
            System.out.println(" " + appendedArray[i]);
        }
*/

        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));


    }

    /*static Object[] append(Object[] arr, Object...elements){
        final int N = arr.length;
        Object[] temp = Arrays.copyOf(arr, N + elements.length);

        for (int i = 0; i < elements.length; i++) {
            temp[arr.length+i] = elements[i];

        }
        return temp;
    }*/
}
