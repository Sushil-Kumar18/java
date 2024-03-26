public class oops_05 {

    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sushil");
        Student s3 = new Student(23);
        // Student s4 = new Student("Sushil", 23); ---->This is an example for constructor overloading

        
    }
    
}
class Student{
    String name ;
    int age;

    Student(){
        // This is an non parameterized 
    }
    Student(String name){
        this.name=name;
    }
    
    Student(int age){
        this.age = age;
    }
}
