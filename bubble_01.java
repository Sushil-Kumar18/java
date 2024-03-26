public class bubble_01 {

    // Tis is the code for the bubble sorting
    public static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length -1; i++){
            // int swap = 0;
            for(int j = 0; j < arr.length -1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j ] = arr[j+1];
                    arr[j+1] = temp;
                    // swap++;
                }
            }
        }
    }
    public static void printSort(int arr[]){
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] +" " );
        }
    }
    public static void main(String[] args) {
        int num[] = {1, 5, 2, 9, 8};
        bubbleSort(num);
        printSort(num);
        
    }
    
}
