import java.util.*;

/**
 * @author nidadinc
 * @since 26.06.2021
 */
public class Java101_Odev11 {


    public static void main(String[] args) {

        int temperature;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter temperature: ");
        temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("You can go to skiing.");
        } else if (temperature > 25) {
            System.out.println("You can go to swimming.");
        } else if (temperature >= 5 && temperature < 10) {
            System.out.println("You can go to cinema.");
        } else if (temperature > 15 && temperature <= 25){
            System.out.println("You can go to picnic.");
        } else if (temperature >= 10 && temperature <= 15){
            System.out.println("You can go to picnic or cinema.");
        }
    }
}
