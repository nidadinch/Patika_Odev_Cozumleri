
import java.util.*;

public class Java101_Odev4{

    public static void main(String[] args) {
        int km;
        int startPrice = 10;
        double perKm = 2.20, total;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz: ");

        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;

        System.out.println("Toplam tutar: " + total);

    }
}