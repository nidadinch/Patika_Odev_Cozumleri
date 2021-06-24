package com.company;
import java.util.*;

/**
 * @author nidadinc
 * @since 24.06.2021
 */
public class Java101_Odev2 {

    public static void main(String[] args) {
        int paraDegeri;


        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your cost: ");
            paraDegeri = input.nextInt();

            if(paraDegeri >= 0){
                break;
            }
        }

        double kdvli;
        double kdvTutarı;

        if(paraDegeri < 1000 && paraDegeri > 0){
            kdvli = paraDegeri + (paraDegeri * 0.18);
        }else{
            kdvli = paraDegeri + (paraDegeri * 0.08);
        }
        kdvTutarı = kdvli - paraDegeri;
        System.out.println("KDV'siz Fiyat = " + paraDegeri);
        System.out.println("KDV'li Fiyat = " + kdvli);
        System.out.println("KDV tutarı = " + kdvTutarı);
    }
}
