import java.util.Scanner;
//This is the code that accept an int arguments. The methid should return true ifthe argument is even or false otherwise. Also write a program to test your method 
public class question_22 {
    public static boolean checkeven(int num){
        if(num%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the Value of the num:");
        num = sc.nextInt();
        if(checkeven(num)){
            System.out.println("Even");

        }
        else{
            System.out.println("Odd");
        }
        
    }
    
}
