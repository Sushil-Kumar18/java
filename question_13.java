import java.util.Scanner;
// This is the code to take input week number and print the week name using the switch case 
public class question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num =  sc.nextInt();
        // int dayNum;
        // dayNum = sc.nextInt();
        switch (num) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
        
            default: System.out.println("You have entered the wrong number !");
                break;
        }
    }
    
}
