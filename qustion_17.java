import java.util.Scanner;
// This is the code to read a set of integers and then prints the sum of the even and odd integer
public class qustion_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int even = 0;
        int odd = 0;
        do{
            System.out.println("Enter the Number: ");
                num = sc.nextInt();
                if (num % 2 == 0) {
                    even += num;
                }
                else{
                    odd += num;
                }
                System.out.println("Do You want to continue if yes press 1 or press no");
                choice = sc.nextInt();
        }while(choice == 1);
        System.out.println("The Sum of the Even Number is " + even);
        System.out.println("The Sum of the Odd Number is " + odd);
    }
    
}
