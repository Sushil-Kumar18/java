public class oops_15 {
    // This is the code for super static
    public static void main(String[] args) {
        Frog f1 = new Frog();
        
        
    }
    
}
class Animals{
    String color;
    Animals(){
        System.out.println("animal constructor is called !");
    }
}

class Frog extends Animals{
    Frog(){
        super.color = "brown";
        System.out.println("frog constructor is called !");
    }
}
