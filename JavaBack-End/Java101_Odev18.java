import java.util.*;

/**
 * @author nidadinc
 * @since 06.07.2021
 */
public class Java101_Odev18 {

    public static void main(String[] args) {
        int number, total = 0;

        while(true){
            Scanner input1 = new Scanner(System.in);
            System.out.print("Sayı Giriniz : ");
            number = input1.nextInt();

            if(number % 2 == 1){
                break;
            }
        }

        for(int i = 1; i < number; i++){
            if(i % 2 == 0 && i % 4 == 0){
                total += i;
            }
        }

        System.out.println("Toplam : " + total);
    }
}

