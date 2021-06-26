import java.util.*;

/**
 * @author nidadinc
 * @since 26.06.2021
 */
public class Java101_Odev12 {


    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        n1 = input.nextInt();

        System.out.print("Please enter second number: ");
        n2 = input.nextInt();

        System.out.print("Please enter third number: ");
        n3 = input.nextInt();

        if(n1 < n2 && n1 < n3){
            if (n2 < n3){
                System.out.print(" n1 < n2 < n3");
            }else{
                System.out.print(" n1 < n3 < n2");
            }
        }else if(n2 < n1 && n2 < n3){
            if (n1 < n3){
                System.out.print(" n2 < n1 < n3");
            }else{
                System.out.print(" n2 < n3 < n1");
            }
        }else if(n3 < n2 && n3 < n1){
            if (n2 < n1){
                System.out.print(" n3 < n2 < n1");
            }else{
                System.out.print(" n3 < n1 < n2");
            }
        }

    }
}
