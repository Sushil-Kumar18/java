public class oops_08 {

    // This is the code for the multiple level inheritance
    public static void main(String[] args) {
        humans h1 = new humans();
        h1.walk = "yes";
        h1.eat();
        System.out.println(h1.walk);
        
    }
    
}
class Animals{
    void eats(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breath");
    }
}

class mammals extends Animal{
    int legs;
}
class humans extends mammals{
    String walk;
}