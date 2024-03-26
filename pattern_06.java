public class pattern_06 {
    // This is the code to print the half inverted pyramid
    public static void Printinverted(int n ){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Printinverted(4);
        
    }
    
}
