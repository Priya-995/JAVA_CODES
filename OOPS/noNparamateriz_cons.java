class Student{
    String name;
    String age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
       System.out.println("constructor called");
    }
}
public class noNparamateriz_cons {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="priya";
        s1.age="23";
        s1.printInfo();

    }   
}
