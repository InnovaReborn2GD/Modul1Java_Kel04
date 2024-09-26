package com.example.livecoding;
import java.util.Arrays;
import java.util.Collections;

public class myclass2 {
    public static void main(String[] args) {
        Integer[] arraySederhana = {0, 12, 2, 4, 6, 7, 9};
        Arrays.sort(arraySederhana, Collections.reverseOrder());
        System.out.println("Array terurut (besar ke kecil): " + Arrays.toString(arraySederhana));
    }
}
