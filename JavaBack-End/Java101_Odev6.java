import java.util.*;

/**
 * @author nidadinc
 * @since 26.06.2021
 */
public class Java101_Odev6 {

    public static void main(String[] args) {
        double kg;
        double height;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height(meters) : ");
        height = input.nextDouble();

        System.out.println("Please enter your kilo(kg): ");
        kg = input.nextDouble();

        double BMI =(kg / (height * height));

        System.out.println("Your Body Mass Index: " + BMI);


    }
}
