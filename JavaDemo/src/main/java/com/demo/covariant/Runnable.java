package com.demo.covariant;

import java.util.Arrays;

public class Runnable {
    public static void main(String[] args) {
        Person[] arr = new Employee[1];
        arr[0] = new Student();
        System.out.println(Arrays.toString(arr));
    }
}
