import java.util.Scanner;
// This is the code to check whether you have fever or not 
public class question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature of our body: ");
        double fever = sc.nextDouble();
        if(fever > 100){
            System.out.println("You hav a Fever !");
        }
        else{
            System.out.println("You dont't have Fever !");
        }
    }
    
}
