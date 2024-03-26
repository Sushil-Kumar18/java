public class oops_11 {
    // This is the code for the Method Overriding
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();
    }
    
}
class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats Plants");
    }
}
