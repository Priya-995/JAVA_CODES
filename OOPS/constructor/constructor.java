package constructor;
public class constructor {
    public static void main(String[] args) {
        Student st2= new Student();   // here smae name constructor called two times only differ in no. of argument passed => constructor overloading
        Student st1= new Student("priya");
        System.out.println(st1.name);
    }
}

class Student{
   String name;
   Student(){ 
    System.out.println("constructor is called...");
   }
   Student(String name){  // this constructor can be automatically created by java(no need to define)
    this.name=name;
   }
}

