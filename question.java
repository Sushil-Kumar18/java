import java.util.Scanner;
// This is the code to find the average of the 3 numbers
public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of the second Number:");
        int b = sc.nextInt();
        System.out.println("Enter the value of the third number:");
        int c = sc.nextInt();
        int average = (a + b+ c)/3;
        System.out.println("The Average of the number is :-  " + average);
    }
}
