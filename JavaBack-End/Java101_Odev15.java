import java.util.*;

/**
 * @author nidadinc
 * @since 01.07.2021
 */
public class Java101_Odev11 {

    public static void main(String[] args) {
        int birthYear;
        String zodiac;

        while(true){
            Scanner input1 = new Scanner(System.in);
            System.out.print("Doğum Yılınızı Giriniz : ");
            birthYear = input1.nextInt();

            if(birthYear >= 0){
                break;
            }
        }

        switch (birthYear % 12){
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Köpek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
            default:
                zodiac = "";
        }

        System.out.println("Çin Zodyağı Burcunuz : " + zodiac);
    }
}

