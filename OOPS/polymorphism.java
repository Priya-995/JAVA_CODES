class Student{
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.printInfo("priya",23);
    }
    
}
