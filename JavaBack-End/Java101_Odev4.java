import java.util.*;

/**
 * @author nidadinc
 * @since 26.06.2021
 */
public class Java101_Odev4{

    public static void main(String[] args) {
        int km;
        int startPrice = 10;
        double perKm = 2.20, total;

        Scanner input = new Scanner(System.in);
        System.out.println("Please provide KM: ");

        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;

        System.out.println("Total cost: " + total);

    }
}