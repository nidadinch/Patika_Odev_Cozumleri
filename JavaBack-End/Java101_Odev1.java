import java.util.*;

/**
 * @author nidadinc
 * @since 24.06.2021
 */
public class Java101_Odev1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Math Grade: ");
        Lecture math = new Lecture(input.nextInt());

        System.out.println("Physics Grade: ");
        Lecture physics = new Lecture(input.nextInt());

        System.out.println("Chemistry Grade: ");
        Lecture chemistry = new Lecture(input.nextInt());

        System.out.println("Turkish Grade: ");
        Lecture turkish = new Lecture(input.nextInt());

        System.out.println("History Grade: ");
        Lecture history = new Lecture(input.nextInt());

        System.out.println("Music Grade: ");
        Lecture music = new Lecture(input.nextInt());

        int total = math.getGrade() + physics.getGrade() + chemistry.getGrade() + turkish.getGrade() + history.getGrade() + music.getGrade();

        double average = findAverage(total);

        findResult(average);


    }

    public static double findAverage(int total){
        double average = total /6.0;
        return average;
    }

    public static void findResult(double average){
        System.out.println((average<=60) ? "Failed":"Passed");
    }

}

class Lecture{
    int grade;

    public Lecture(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
