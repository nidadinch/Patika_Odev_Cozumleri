import java.util.*;

/**
 * @author nidadinc
 * @since 06.07.2021
 */
public class Java101_Odev20 {

    public static void main(String[] args) {
        int number, total = 1;

        while(true){
            Scanner input1 = new Scanner(System.in);
            System.out.print("Faktöriyel sayısını giriniz : ");
            number = input1.nextInt();

            if(number >= 0){
                break;
            }
        }

        for(int i = 1; i <= number; i++){
            total *= i;
        }

        System.out.println(number + ". Faktöriyel : " + total);
    }
}

