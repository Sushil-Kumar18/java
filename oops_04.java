public class oops_04 {

    // This is the code for creating the Constructor
    /// When we are not creating constructor then complier create their own constructor but we cant initize 
    public static void main(String[] args) {
        // Student s1 = new Student("Sushil"); ---> this is used when we have to given our own string
        // System.out.println(s1.name);

        Student s1 = new Student();
        
    }
    
}
class Student{
    String name ;
    int age;


    // Student(){
    //     // When we dont want to write anything 
    // }

    // Student(String name){

        // when we have to given our own string
    //     this.name = name;
    // }

    Student(){
        System.out.println("Hello guys "); ///// These are the three ways to create Constructors
    }
}
