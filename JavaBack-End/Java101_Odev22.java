import java.util.*;

/**
 * @author nidadinc
 * @since 06.07.2021
 */
public class Java101_Odev22 {

    public static void main(String[] args) {
        int number, temp, basamakDegeri, basamakToplam = 0, basamak = 0;

        while(true){
            Scanner input1 = new Scanner(System.in);
            System.out.print("Sayıyı giriniz : ");
            number = input1.nextInt();

            if(number >= 0){
                break;
            }
        }

        temp = number;
        while(temp != 0){
            temp /= 10;
            basamak++;
        }

        temp = number;

        while(temp != 0){
            basamakDegeri = temp % 10;
            basamakToplam += basamakDegeri;
            temp /= 10;
        }

        System.out.println(number + " Sayısının basamak toplamı :" + basamakToplam);
    }
}

