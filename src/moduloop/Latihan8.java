package moduloop;

import java.util.Scanner;

public class Latihan8 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan nilai TPA : ");
        int TPA = masukan.nextInt();
        System.out.println("Masukan nilai Bahasa Inggris : ");
        int BahasaInggris = masukan.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80)) {
            System.out.println("Siswa Dapat Beasiswa");
        } else {
            System.out.println("Siswa Tidak Dapat Beasiswa");
        }

    }

}
