import java.util.Scanner;
// This is the code to find the factorial of the number
public class question_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want to find the Factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= num; i ++){
            fact *= i;
        }
        System.out.println(" The Factorial of the number number is " + fact);
    }
    
}
