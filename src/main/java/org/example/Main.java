package org.example;

import java.util.Arrays;

public class Main {

    public static int largestGap(int[] arr){
        Arrays.sort(arr);
        int gap = 0;
        for(int i = 0; i < arr.length-1;i++){
            if(arr[i + 1] - arr[i] > gap){
                gap = arr[i + 1] - arr[i];
            }
        }
        return gap;
    }

    public static void main(String[] args) {

        int[] arr1 = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        System.out.println(largestGap(arr1));

        int[] arr2 = {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7};
        System.out.println(largestGap(arr2));

        int[] arr3 = {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9};
        System.out.println(largestGap(arr3));
    }
}