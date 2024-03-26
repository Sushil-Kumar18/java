import java.util.Scanner;
// This is the code to check whether the year entered by the user is leap year or not 
public class question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 400 == 0)
            System.out.println(year + " is a Leap Year");

        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println(year + " is a Leap Year");

        else
            System.out.println(year + " is not a Leap Year");

    }

}
