import java.util.Scanner;
// This is the code to compute the sum of the digits in an integer
public class question_24 {
    public static int printSum(int n) {
        int sumofdigits = 0;
        while (n > 0) {
            int last = n % 10;
            sumofdigits += last;
            n /= 10;
        }
        return sumofdigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int num = sc.nextInt();
        int sum = printSum(num);
        System.out.println(sum);
    }
}
