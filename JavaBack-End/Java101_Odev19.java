import java.util.*;

/**
 * @author nidadinc
 * @since 06.07.2021
 */
public class Java101_Odev19 {

    public static void main(String[] args) {
        int number;

        while(true){
            Scanner input1 = new Scanner(System.in);
            System.out.print("Sınır sayısını giriniz : ");
            number = input1.nextInt();

            if(number >= 0){
                break;
            }
        }

        for(int i = 1; i < number; i++){
            if(i % 4 == 0 || i % 5 == 0){
                System.out.println(i);
            }
        }

    }
}

