import java.util.*;

/**
 * @author nidadinc
 * @since 01.07.2021
 */
public class Java101_Odev14 {

    public static void main(String[] args) {
        int km, yas, yolculukTipi;
        double yasIndirimi = 0, gidisDonusIndirimi = 0, totalPrice = 0;
        double pricePerKm = 0.10;

        while(true){
            Scanner input1 = new Scanner(System.in);
            System.out.print("Mesafeyi km türünden giriniz : ");
            km = input1.nextInt();
            System.out.print("Yaşınızı giriniz : ");
            yas = input1.nextInt();
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            yolculukTipi = input1.nextInt();

            if(km >= 0 && (yolculukTipi == 1 ||  yolculukTipi == 2 ) && (yas >= 0)){
                break;
            }else{
                System.out.println("Hatalı Veri Girdiniz !");
                System.out.println("--------------------------");
            }
        }

        double normalPrice = km * pricePerKm;

        if(yas < 12){
            yasIndirimi = normalPrice * 0.5 ;
        }else if(yas >= 12 && yas <= 24){
            yasIndirimi = normalPrice * 0.1 ;
        }else if(yas >= 65){
            yasIndirimi = normalPrice * 0.3 ;
        }

        if( yolculukTipi == 2){
            gidisDonusIndirimi = (normalPrice - yasIndirimi) * 0.2;
            totalPrice = (normalPrice - (yasIndirimi + gidisDonusIndirimi) )* 2;
        }else{
            totalPrice = normalPrice - (yasIndirimi + gidisDonusIndirimi);
        }

        System.out.println("Toplam Tutar = " + totalPrice + "TL");
    }
}

