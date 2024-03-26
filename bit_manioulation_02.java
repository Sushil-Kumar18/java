public class bit_manioulation_02 {

    /// This is the code to check whether a number is even or odd by bit manipulation
    public static void evenORodd(int num){
        int Bitmass = 1;
        if((num & Bitmass) == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        evenORodd(12);
        evenORodd(111);
        evenORodd(10);
        
    }
    
}
