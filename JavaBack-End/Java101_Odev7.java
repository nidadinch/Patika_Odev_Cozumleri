import java.util.*;

/**
 * @author nidadinc
 * @since 26.06.2021
 */
public class Java101_Odev7 {

    public static void main(String[] args) {
        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double aubergine = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("How many kilos are the pears? : ");
        double pearKg = input.nextDouble();

        System.out.print("How many kilos are the apples? : ");
        double appleKg = input.nextDouble();

        System.out.print("How many kilos are the tomatoes? : ");
        double tomatoKg = input.nextDouble();

        System.out.print("How many kilos are the bananas? : ");
        double bananaKg = input.nextDouble();

        System.out.print("How many kilos are the aubergines? : ");
        double aubergineKg = input.nextDouble();

        double total = (pear * pearKg) + (apple * appleKg) + (tomato * tomatoKg) + (banana * bananaKg) + (aubergine * aubergineKg);

        System.out.println("Total Cost : " + total);


    }
}
