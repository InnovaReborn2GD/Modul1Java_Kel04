package com.example;

import java.util.Scanner;
public class Percobaan2java_Kel04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] siswa = new String[4];

        System.out.print("Mahasiswa pertama: ");
        siswa[0] = input.nextLine();
        System.out.print("Mahasiswa kedua: ");
        siswa[1] = input.nextLine();
        System.out.print("Mahasiswa ketiga: ");
        siswa[2] = input.nextLine();
        System.out.print("Mahasiswa keempat: ");
        siswa[3] = input.nextLine();
        System.out.println();

        System.out.print("Urutan mahasiswa: ");
        System.out.println(siswa[0]+", "+siswa[1]+", "+siswa[2]+", "+siswa[3]);
        System.out.print("Mahasiswa urutan pertama: ");
        System.out.println(siswa[0]);
        System.out.print("Mahasiswa urutan kedua: ");
        System.out.println(siswa[1]);
        System.out.print("Mahasawiswa urutan ketiga: ");
        System.out.println(siswa[2]);
        System.out.print("Mahasiswa urutan keempat: ");
        System.out.println(siswa [3]);
    }
}