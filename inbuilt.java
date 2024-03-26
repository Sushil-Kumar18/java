 import java.util.Arrays;
 public class inbuilt {
    public static void PrintArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,9,1,3,6};
        Arrays.sort(arr);
        PrintArr(arr);
      
    }
    
}
