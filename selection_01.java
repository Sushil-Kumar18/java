public class selection_01 {

    // This is the code to sort an array using selection sorting
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length -1; i++){
            int min = i;
            for(int j = i +1; j < arr.length; j ++){
                if(arr[min] < arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void PrintSort(int arr[]){
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 8, 9 ,1};
        selectionSort(arr);
        PrintSort(arr);
    }
    
}
