public class question_29 {

    // This is the code to find the max of the sub array in that array
    public static void sumSub(int arr[]){
        int curr= 0;
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int first = i;
            for(int j = i ; j < arr.length;j++){
                int end = j;
                curr = 0;
                for(int k = first; k < end; k++){
                    curr += arr[k];
                }
                System.out.println(curr);
                if (sum < curr) {
                    sum = curr;
                }
            }
        }
        System.out.println("The Maxmium value of the subarray is " + sum);
    }
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4 ,5};
        sumSub(num);
    }
    
}
