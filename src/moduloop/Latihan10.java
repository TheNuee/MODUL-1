package moduloop;

import java.util.Scanner;

public class Latihan10 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan Batas Bilangan : ");
        int batas = masukan.nextInt();
        int hasil = 0;
        for (int i = 1; i <= batas; i++) {
            hasil += i;
            System.out.println("Total Jumlahnya Adalah : " + hasil);

        }
    }
}
