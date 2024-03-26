public class oops_06 {


    /// This is the the code for the copy constructor
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "sushil";
        s1.age = 18;
        s1.password = 2131;
        s1.marks[0] = 34;
        s1.marks[1] = 74;
        s1.marks[2] = 84;

        Student s2 = new Student(s1);
        s1.marks[2] = 23;
        s2.password = 234;
        for(int i = 0; i <3; i++){
            System.out.println(s2.marks[i]);
        }
        
    }
    
}
class Student{
    String name ;
    int age;
    int password;
    int marks[];

    //shallow  copy constructor
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.age = s1.age;
    // }

    // deep copy constructor
        Student(Student s1){
            marks= new int[3];
            this.name = s1.name;
            this.age = s1.age;
            for(int i =0; i < marks.length;i++)
            {
                this.marks[i] = s1.marks[i];
            }
            
        }


    Student(){
        marks= new int[3];


    }
    Student(String name){
        this.name = name;
        marks= new int[3];

    }
    Student(int age){
        this.age = age;
        marks= new int[3];

    }
}
