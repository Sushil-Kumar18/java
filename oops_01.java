public class oops_01 {

    ///This is the example of class and objects
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("RED");
        p1.setTip(12);
        System.out.println(p1.tip);
        System.out.println(p1.color);
    }
    
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
