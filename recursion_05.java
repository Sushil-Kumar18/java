public class recursion_05 {
    // This is the code to find the fibonacci number of the nth number
    public static int factio(int n){
        if( n == 0 || n ==1){
            return 1;
        }
        int fib1 = factio(n -1);
        int fib2 = factio(n -2);
        int fib = fib1 +fib2;
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(factio(5));
        
    }
    
}
