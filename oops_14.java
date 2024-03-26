public class oops_14 {

    // This is the code for Static Keywords
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Sushil";
        System.out.println(s1.name);
        s1.schoolname = "KPS";
        System.out.println(s1.percentage(2, 2, 2));

        Students s2 = new Students();
        s2.name = "Pink";
        System.out.println(s2.name);
        System.out.println(s2.schoolname);
        
    }
    
}

class Students{
    static int percentage(int a, int b, int c){
        return (a + b +c)/3;
    }
    String name;
    int rollno;
    static String schoolname;

    void setname(String name){
        this.name = name;
    }

    String getname(){
        return this.name;
    }
}