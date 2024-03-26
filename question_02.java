import java.util.Scanner;
// This is the code to find the area of the square
public class question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the sides of the square: -  ");
        int side = sc.nextInt();
        System.out.print("The area of the square is : ");
        int area = side * side;
        System.out.println(area + " cmsq");
    }
}
