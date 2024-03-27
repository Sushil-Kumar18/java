public class recursion_03 {
    // This is the code for finding the factorail of nth number
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        int fact1 = factorial(num -1);
        int fact = num * fact1;
        return fact;
    }
    public static void main(String[] args) {
        int facti = factorial(4);
        System.out.println(facti);
        
    }
    
}
