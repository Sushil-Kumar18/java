import java.util.Scanner;
// this is the code to find the total cost of a the items back to the user as their bill
public class question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the pencil:- ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the value of the pen: - ");
        float pen = sc.nextFloat();
        System.out.println("Enter the value an eraser: - ");
        float eraser = sc.nextFloat();
        float bill = pencil + pen + eraser;
        System.out.print("The Total Cost of the items is : - ");
        System.out.println(bill);

    }
}
