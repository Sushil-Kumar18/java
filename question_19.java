import java.util.Scanner;
// This is the code to print the table of the a number is entered by the user
public class question_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("The Table of the number is " + num);
        for(int i = 1; i <= 10; i++){
            System.out.println(num +" * "+ i +" = "+ i*num );
        }
    }
    
}
