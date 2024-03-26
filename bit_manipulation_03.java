public class bit_manipulation_03 {
    public static int getbit(int num, int i) {
        int bitmas = 1 << i;
        if ((num & bitmas) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setbit(int num, int i) {
        int bitmas = 1 << i;
        return num | bitmas;
    }

    public static int clearBit(int num, int i){
        int bitmas = ~(1<<i);
        return num & bitmas;
    }

    public static void main(String[] args) {
        System.out.println(getbit(10, 2)); //// ------->This is the code for the get Ith bit
        System.out.println(getbit(10, 3)); //// -------> This is the code for the get Ith bit

        System.out.println(setbit(10, 2)); ///// ------> This is the code for the set Ith bit
        System.out.println(setbit(8, 2)); ///// ------> This is the code for the set Ith bit
        System.out.println(clearBit(10, 1));   //////-----> This is the code for the clear Ith bit

    }

}
