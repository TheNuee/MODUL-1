package moduloop;

import java.util.Scanner;

public class ModulLatihan2 {

    public static void main(String[] args) {
        System.out.println("Muhammad Rizky Amiruddin Hakim/XR6/32");

        Scanner masuk = new Scanner(System.in);
        float cel, rea, fah, kel;

        System.out.print("Masukan Suhu Celcius : ");
        cel = masuk.nextFloat();
        rea = 4 * cel / 5;
        fah = (9 * cel / 5) + 32;
        kel = cel + 273;
        System.out.println("=-=-=-=-=-=-=-=");
        System.out.println("Reamur = " + rea);
        System.out.println("Fahrenheit = " + fah);
        System.out.println("Kelvin = " + kel);
        System.out.println("=-=-=-=-=-=-=-=-=");
    }
}
