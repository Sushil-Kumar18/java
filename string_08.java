import java.util.Scanner;

// This is the code to count how many times lowercase vowels occured in a String entered by an User 
public class string_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("The Total number of times vowels occurs " + count);
    }

}
