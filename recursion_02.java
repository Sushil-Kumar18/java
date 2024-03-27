public class recursion_02 {

    // This is the code to print the number from 1 to nth number in increasing order
    public static void incresingOrder(int num){
        if(num == 1){
            System.out.print(num +" ");
            return;
        }
        incresingOrder( num -1); 
        System.out.print(num + " ");
    }
    public static void main(String[] args) {
        int num = 10;
        incresingOrder(num);
    }
    
}
