import java.util.*;
import java.util.Collection;
public class inbuilt_01 {
    // This is the code for inbuilt Sort
    public static void printarr(Integer arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {2, 9, 3, 12, 34, 19, 56}; 
        // Arrays.sort(arr, 0, 3);
        // Arrays.sort(arr);
        Arrays.sort(arr, 0, 5, Collections.reverseOrder()); // ---This is the code to sort using collection
        printarr(arr);
    }
}
