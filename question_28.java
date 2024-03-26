public class question_28 {

    //This is the code to print the subarray of an array
    public static void PrintSub(int arr[]){
        for(int i = 0; i < arr.length;i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                for(int k = start; k < end;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4 , 5};
        PrintSub(num);

    }
    
}
