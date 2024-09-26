package id.innovareborn.modul1;
import java.util.Arrays;

public class arrayJava2d {
    public static void main(String[] args) {
        System.out.println("Kelompok 4");
            String[] peserta0 = {"Farhan", "Cilacap", "Programmer"};
            String[] peserta1 = {"Aisha", "Tanjungpinang", "Embedded System Engineer"};
            String[] peserta2 = {"Athar", "Bogor", "Game Developer"};
            String[] peserta3 = {"Zaid", "Semarang", "Network Engineer"};
            String[][] listPeserta = {peserta0, peserta1, peserta2, peserta3};

            System.out.println("peserta = " + Arrays.deepToString(listPeserta));
            for (String[] peserta : listPeserta) {
                System.out.println("nama\t\t: " + peserta[0]);
                System.out.println("asal daerah\t: " + peserta[1]);
                System.out.println("cita-cita\t: " + peserta[2] + "\n");
            }
        }
    }

