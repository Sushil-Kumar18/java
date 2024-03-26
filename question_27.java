public class question_27 {
    // This is the code to print the pairs of the array
    public static void printPair(int num[]){
        int tp = 0;
        for(int i = 0; i < num.length; i++){
            int curr = num[i];
            for(int j = i+1; j < num.length; j++){
                System.out.print( "(" + curr + "," +  num[j] +  ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("The Total Number of the Pair is " + tp);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5 ,6, 4};
        printPair(arr);
    }
    
}
