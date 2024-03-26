import java.util.Scanner;
public class string_01 {
    public static void printletter(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Name:");
        // String name = sc.nextLine();
        // System.out.println(name);
        // // This below is to find the length of the string
        // System.out.println(name.length());

        // This below is the concatenation
        String firstname = "Kumar";
        String lastname = "Pal";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        // This below is char at function 
        printletter(fullname);
    }
    
}
