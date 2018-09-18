package moduloop;

import java.util.Scanner;

public class ModulLatihan1 {

    public static void main(String[] args) {
        System.out.println("Muhammad Rizky Amiruddin Hakim/XR6/32");
        Scanner masuk = new Scanner(System.in);
        float phi, r, luas;
        System.out.println("Masukan Nilai phi : ");
        phi = masuk.nextFloat();
        System.out.println("Masukan Nilai Jari-jari : ");
        r = masuk.nextFloat();
        luas = 4 * phi * r * r;
        System.out.println("Luas Permukaan Bola : " + luas);
    }
}
