public class insertion_01 {
    // This is the code to sort an array using insertion sorting
    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i ++){
            int curr = arr[i];
            int pre= i-1;
            while (pre >= 0 && arr[pre] > curr) {
                arr[pre +1] = arr[pre];
                pre--;  
            }
            arr[pre + 1] = curr;
        }
    }
    public  static void printSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int aarr[] = { 9, 4, 3, 7, 1};
        insertionSort(aarr);
        printSort(aarr);
    }
}
