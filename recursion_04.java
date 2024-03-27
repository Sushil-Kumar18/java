public class recursion_04 {

    // This is the code to find the sum of the first nth natural number 
    public static int findsum(int num){
        if(num == 0){
            return 0;
        }
        int sumi = findsum( num -1);
        int sum = num + sumi;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(findsum(5));
    }
    
}
