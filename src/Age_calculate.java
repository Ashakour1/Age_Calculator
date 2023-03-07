import java.time.Year;
import java.util.Scanner;

public class Age_calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Days, Weeks, Months, years;

        System.out.println("enter days");
        Days = input.nextInt();

        Weeks = Days / 7;
        Months = Days / 30;
        years = Months / 12;

        System.out.println("Days : " + Days + "\n" + "Weeks :" + Weeks + "\n" +
                "Months :" + Months + "\n" + "Years :" + years);


    }
}
