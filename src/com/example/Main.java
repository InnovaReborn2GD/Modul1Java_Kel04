
package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        System.out.println("Halo dunia!");
        Scanner input = new Scanner(System.in);
        System.out.print("satu kata buat inova bensin: ");
        String pw = input.nextLine();
        System.out.println("Innova bensin, passwordnya " + pw);
    }
}