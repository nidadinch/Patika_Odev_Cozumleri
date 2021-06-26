import java.util.*;

/**
 * @author nidadinc
 * @since 26.06.2021
 */
public class Java101_Odev9 {

    public static void main(String[] args) {
        String userName, password, reset;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter username : ");
        userName = input.nextLine();

        System.out.print("Please enter password : ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Successfully signed in.");
            
        }else{
            Scanner input2 = new Scanner(System.in);
            System.out.print("Password is incorrect. Do you want to reset password? Y/N : ");
            reset = input.nextLine();

            if(reset.equals("Y")){
                Scanner input3 = new Scanner(System.in);
                System.out.print("Please enter new password : ");

                if(input3.nextLine().equals("java123")){
                    System.out.println("Could not create password, please enter another password.");

                }else{
                    password = input.nextLine();
                    System.out.println("Password created.");
                }

            }else{
                System.out.println("Program ended.");
            }
        }


    }
}
