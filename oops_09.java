public class oops_09 {

    // This is the code for the hierarchial Inheritance
    public static void main(String[] args) {
        Humans h1 = new Humans();
        h1.eats();
        h1.waste();
        h1.breath();
        Fish f1 = new Fish();
        f1.breath();
        f1.eats();
        
    }
    
}
class Animals{
    void eats(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breaths");
    }
    void drinks(){
        System.out.println("Drinks");
    }
}

class Fish extends Animals{
    void swims(){
        System.out.println("Swims");
    }
}

class Humans extends Animals{
    void waste(){
        System.out.println("Wastes");
    }
}