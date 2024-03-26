import java.util.Scanner;
// This is the code to find the average of the 3 numbers
public class question_21 {
    public static int printAvera(int a , int b, int c){
        int aver =( a + b+ c)/3;
        return aver;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        int average = printAvera(a, b, c);
        System.out.println(average);

        
    }
}
