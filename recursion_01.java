import java.util.Scanner;

// This is the code for printing the reverse order from nth number to 1 using recursion

public class recursion_01 {
    public static void reverseOrder(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        System.out.println(num + " ");
        reverseOrder(num -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the Number: ");
        reverseOrder(10);
    }
    
}
