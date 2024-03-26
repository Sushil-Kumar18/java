public class question_26 {
    // This is the code to find the reverse of the array 
    
    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 5, 1, 8, 9 };
        reverse(num);
        for(int i = 0; i< num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

}
