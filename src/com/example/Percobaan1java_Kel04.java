package com.example;
import java.util.Scanner;

public class Percobaan1java_Kel04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Usia tahun ini: ");
        int umur = input.nextInt();

        System.out.println("Halo " + nama + ", kamu lahir tahun " + (2024 - umur));
    }
}
