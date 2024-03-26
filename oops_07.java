public class oops_07 {

    // This is the code inheritance
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.color = "Black";
        System.out.println(f1.color);
        f1.eat();
        f1.isFly = false;
        f1.reproduce();
    }
    
}
class Animal{
    String color;
    void reproduce(){
        System.out.println("Reproduce");
    }
    void eat(){
        System.out.println("Eats");
    }
    void breaths(){
        System.out.println("It breaths");
    }
}
class Fish extends Animal{
    int fins;
    boolean isFly;
}