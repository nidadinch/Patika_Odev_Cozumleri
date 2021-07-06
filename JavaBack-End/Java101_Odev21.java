import java.util.*;

/**
 * @author nidadinc
 * @since 06.07.2021
 */
public class Java101_Odev21 {

    public static void main(String[] args) {
        int number, exp, total = 1;

        Scanner input1 = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        number = input1.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        exp = input1.nextInt();
        

        for(int i = 1; i <= exp; i++){
            total *= number;
        }

        System.out.println("Total : " + total);
    }
}

