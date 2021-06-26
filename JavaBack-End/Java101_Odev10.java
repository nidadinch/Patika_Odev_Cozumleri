import java.util.*;

/**
 * @author nidadinc
 * @since 26.06.2021
 */
public class Java101_Odev10 {
    static ArrayList<Integer> classes = new ArrayList<>();

    public static void main(String[] args) {

        int math, physics, chemistry, turkish, music;

        Scanner input = new Scanner(System.in);
        System.out.println("Math Grade: ");
        math = checkGrade(input.nextInt());

        System.out.println("Physics Grade: ");
        physics = checkGrade(input.nextInt());

        System.out.println("Chemistry Grade: ");
        chemistry = checkGrade(input.nextInt());

        System.out.println("Turkish Grade: ");
        turkish = checkGrade(input.nextInt());

        System.out.println("Music Grade: ");
        music = checkGrade(input.nextInt());


        double average = (math + physics + chemistry + turkish + music) / classes.size();

        if(average < 55){
            System.out.println("You have failed!");
        }else{
            System.out.println("Congratulations! You have passed!");
        }
        System.out.println("Average: " + average);

    }

    public static int checkGrade(int grade){

        if((grade <= 100 && grade >= 0)) {
            classes.add(grade);
        }else{
            grade = 0;
        }
        return grade;
    }
}
