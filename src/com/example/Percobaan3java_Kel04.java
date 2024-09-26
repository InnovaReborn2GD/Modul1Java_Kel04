package com.example;
public class Percobaan3java_Kel04 {
    public static void main(String[]args) {
        String[][] array = {
                {"Farhan", "Aisha", "Athar", "Zaid"},
                {"Fortuner 2.8", "Innova bensin", "Pajero Sport", "BMW M4 Competition"}
                };
        System.out.println( "Mobil impian " + array[0][0] + " adalah " + array[1][0] + " dan " + array[1][2]);
        System.out.println( "Mobil impian " + array[0][1] + " adalah " + array[1][1] + " dan " + array[1][3]);
        System.out.println( "Mobil impian " + array[0][2] + " adalah " + array[1][2] + " dan " + array[1][1]);
        System.out.println( "Mobil impian " + array[0][3] + " adalah " + array[1][3] + " dan " + array[1][0]);
    }
    }