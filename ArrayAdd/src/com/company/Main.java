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


        int[] javaArray = {167, -2, 16, 99, 26, 92, 43, -214, -514, 35, 80};
        int[] javaArray2 = {55,11,42,5,1,2};



        Array ourArray = new Array(javaArray);
        Array ourArray2 = new Array(javaArray2);



      //  System.out.println(ourArray.get(0));//1
        //System.out.println(ourArray.get(1));//3
        //System.out.println(ourArray.get(2));//-8

        //System.out.println(ourArray.size());//3

        //System.out.println(ourArray.toString());

      //  ourArray.set(1, 11);//{1, 10, -8} //array[1]=10
        //System.out.println(ourArray.get(1));

        /**
         *
         * System.out.println(ourArray.size());
         */




        ourArray.sorted(javaArray);
        ourArray2.sorted(javaArray2);

        System.out.println(ourArray.toString());
        System.out.println(ourArray2.toString());






    }
}

    /*static Object[] append(Object[] arr, Object...elements){
        final int N = arr.length;
        Object[] temp = Arrays.copyOf(arr, N + elements.length);

        for (int i = 0; i < elements.length; i++) {
            temp[arr.length+i] = elements[i];

        }
        return temp;
    }*/

