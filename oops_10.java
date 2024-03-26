public class oops_10 {
    /// This is the code for Method Overloading
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(2, 4));
        System.out.println(c1.sum(2.4f, 2.6f));
        System.out.println(c1.sum(3, 5, 7));
        
    }
    
}
class Calculator{
    int sum(int a , int b){
        return a+ b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b +c;
    }
}
