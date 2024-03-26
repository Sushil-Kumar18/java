public class question_30 {
    // This is to find the sum of the subarray by prefix
    public static void prefix(int arr[]) {
        int curr = 0;
        int sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int first = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                curr = first == 0 ? prefix[end] : prefix[end] - prefix[first - 1];
                if (sum < curr) {
                    sum = curr;
                }
            }
        }
        System.out.println("The MAx sum of " + sum);
    }

    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 5, 6, 1 };
        prefix(num);

    }

}
