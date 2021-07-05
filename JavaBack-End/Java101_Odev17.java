import java.util.*;

/**
 * @author nidadinc
 * @since 05.07.2021
 */
public class Java101_Odev17 {

    public static void main(String[] args) {
        int number,count = 0, total = 0;

        while(true){
            Scanner input1 = new Scanner(System.in);
            System.out.print("Sayı Giriniz : ");
            number = input1.nextInt();

            if(number >= 0){
                break;
            }
        }

        for(int i = 1; i < number; i++){
            if(i % 3 == 0 || i % 4 == 0){
                total += i;
                count++;
            }
        }

        double average = total / count;
        System.out.println("Ortalama : " + average);
    }
}

