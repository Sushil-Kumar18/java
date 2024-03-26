import java.util.Scanner;
// This is the code to check whether the number is postive or negative
public class question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("The number you  entered is negative number.");
        }
        else{
            System.out.println("The number you entered is positive number.");
        }
    }
    
}
