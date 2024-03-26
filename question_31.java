public class question_31 {
    // This is the code for kadane
    public static void kadane(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            cs = cs+ arr[i];
            if(cs <0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("The Max is " + ms);
    }
    public static void main(String[] args) {
        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3};
        kadane(num);

        
    }
    
}
