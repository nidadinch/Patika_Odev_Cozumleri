import java.util.*;

/**
 * @author nidadinc
 * @since 06.0.2021
 */
public class Java101_Odev23{

    public static void main(String[] args) {
        double number, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz : ");

        number = input.nextDouble();

        while (number > 0) {
            total += (1 / number);
            number--;
        }

        System.out.println(total);

    }
}