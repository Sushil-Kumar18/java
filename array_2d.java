import java.util.Scanner;
// This is the code to print the 2 d array and find the index of an element in an array
public class array_2d {
    public static void findElemet(int arr[][], int key){
            key = 5;
            for(int i = 0; i <arr.length; i++){
                for(int j = 0; j<arr[0].length; j++){
                    if(arr[i][j] == key){
                        System.out.println("(" + i + "," + j + ")");
                    }
                }
            }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        int matrix[][]= new int[3][3];
        int n = matrix.length; 
        int m = matrix[0].length; 
        for(int i = 0; i <n; i++){
            for(int j = 0; j <m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i <n; i++){
            for(int j = 0; j <m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        findElemet(matrix, 5);
    }
    
}
