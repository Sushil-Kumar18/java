import java.util.HashSet;
import java.util.Scanner;

// This is the code to return true , if any value appears at least twice in the array and the return false if evey element is distinct
public class question_34 {
    public static boolean checks(int number[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < number.length; i++){
            if(set.contains(number[i])){
                return true;
            }
            else{
                set.add(number[i]);
            }
        }
        return false;
    }
    public static boolean check(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 1 };
        System.out.println(check(num));

    }
}
