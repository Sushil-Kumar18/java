public class pattern_04 {
    public static void main(String[] args) {
        int n = 4;
        char cha = 'A';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(cha);
                cha++;
            }
            System.out.println();
        }

    }
    
}
