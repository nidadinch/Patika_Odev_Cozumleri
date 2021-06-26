import java.util.*;

/**
 * @author nidadinc
 * @since 26.06.2021
 */
public class Java101_Odev8 {

    public static void main(String[] args) {
        int number1, number2, selection, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        number1 = input.nextInt();

        System.out.print("Please enter second number : ");
        number2 = input.nextInt();

        System.out.print("Please Select One of these numbers : \n 1-Addition \n 2-Substraction \n 3- Multiplication \n 4- Division \n");
        selection = input.nextInt();

        switch (selection){
            case 1:
                total = number1 + number2;
                System.out.println("Total: " + total);
                break;
            case 2:
                total = number1 - number2;
                System.out.println("Total: " + total);
                break;
            case 3:
                total = number1 * number2;
                System.out.println("Total: " + total);
                break;
            case 4:

                if(number2 != 0){
                    total = number1 / number2;
                    System.out.println("Total: " + total);
                    break;
                }else{
                    System.out.println("Invalid Operation! A Number can not divided by zero! Please Try Again");
                    break;
                }

            default:
                System.out.println("Invalid Operation! Please Try Again");

        }

    }
}
