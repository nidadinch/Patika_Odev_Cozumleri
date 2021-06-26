import java.util.*;

/**
 * @author nidadinc
 * @since 26.06.2021
 */
public class Java101_Odev5 {

    public static void main(String[] args) {
        int radius;
        int alpha;
        final double PI = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius of circle : ");
        radius = input.nextInt();

        System.out.println("Please enter measure of the central angle of the circle: ");
        alpha = input.nextInt();

        double area = (PI * (radius * radius) * alpha ) / 360;

        System.out.println("Area of circle: " + area);


    }
}
