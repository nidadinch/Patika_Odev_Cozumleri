package com.company;
import java.util.*;

/**
 * @author nidadinc
 * @since 24.06.2021
 */
public class Java101_Odev3 {

    public static void main(String[] args) {
        int kenar1;
        int kenar2;
        int kenar3;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenar Uzunluğu: ");
        kenar1 = input.nextInt();

        System.out.println("2. Kenar Uzunluğu: ");
        kenar2 = input.nextInt();

        System.out.println("3. Kenar Uzunluğu: ");
        kenar3 = input.nextInt();

        double cevre = kenar1 + kenar2 + kenar3;
        double u = cevre /2;

        double alanalan = u * (u-kenar1) * (u-kenar2) * (u-kenar3);
        double alan = Math.sqrt(alanalan);

        System.out.println("Üçgenin alanı: " + alan);


    }
}
