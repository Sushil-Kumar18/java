public class oops_03 {

    /// This is the code for the getter and setter
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("RED");
        p1.setTip("34");
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        
    }
    
}
class Pen{
    private String color;
    private String tip;

    String getColor(){
        return this.color;
    }

    String getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(String newTip){
        tip = newTip;
    }
}
