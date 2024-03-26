public class pattern_07 {
// This is the code to print the half inverted pyramid with numbers
    public static void printNumber(int num){
        for(int i = 1; i <=num; i ++){
            // number
            for(int j = 1; j <= num -i +1; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printNumber(5);
        
    }
    
}
