package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        int temp = 0;
        int min = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
                temp = i;
            }
        }
        int dummy = arr[0];
        arr[0] = arr[temp];
        arr[temp] = dummy;

    }

}