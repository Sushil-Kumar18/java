import java.util.Scanner;
// This is the code to check whether the number entered by the user is palindrome
public class question_23 {
    public static boolean ispar(int num){
        int palindrome = num;
        int reverse= 0;
        while (palindrome != 0) {
            int reminder = palindrome% 10;
            reverse = reverse * 10 + reminder;
            palindrome = palindrome /10;
        }
        if (num == reverse) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        if (ispar(number)) {
            System.out.println("The Number "+ number + " is a Palindrome");
        }
        else{
            System.out.println("The Number " + number + " is not a Palindrome");
        }

    }
    
}
