import java.util.*;

/**
 * @author nidadinc
 * @since 05.07.2021
 */
public class Java101_Odev16 {

    public static void main(String[] args) {
        int year;

        while(true){
            Scanner input1 = new Scanner(System.in);
            System.out.print("Yıl Giriniz : ");
            year = input1.nextInt();

            if(year >= 0){
                break;
            }
        }

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println( year + " bir artık yıldır !");
                }else{
                    System.out.println( year + " bir artık yıl değildir !");
                }
            }else {
                System.out.println( year + " bir artık yıl değildir !");
            }
        }else{
            System.out.println( year + " bir artık yıl değildir !");
        }
    }
}

