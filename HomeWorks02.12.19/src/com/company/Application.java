package com.company;

import com.company.collection.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Application {

    public static void main(String[] args) {

        int [] testArray = new int[] {1,3,5,-1,-3,-5};
       // int arraySize = testArray.length;

//        int [] newArray = new int[6];
        int [] newArray;



        int number = 77;

       newArray = ArrayUtils.append(testArray,number);
         newArray = ArrayUtils.insert(testArray, 0, number);

            ArrayUtils.selectionSort(newArray);

            int result =  ArrayUtils.binarySearch(newArray,78);




  /*      newArray = ArrayUtils.copyArray(testArray);
        newArray[0] = 70;*/



        System.out.println(Arrays.toString(testArray));
        System.out.println(Arrays.toString(newArray));
        System.out.println(result);



    }
}
