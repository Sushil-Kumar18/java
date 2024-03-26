public class oops_12 {
    ///  This is  the code for the abstraction
    public static void main(String[] args) {
        Camel c1 = new Camel();
        c1.eats();
        c1.walk();

        Humans h1 = new Humans();
        h1.eats();
        h1.walk();
    }
    
}

abstract class Animal{
    void eats(){
        System.out.println("eats");
    }

    abstract void walk();
}

class Camel extends Animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Humans extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}