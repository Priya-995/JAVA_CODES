

class Student{
    String name;
    String age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,String age){
      this.name=name;
      this.age=age;
      
    }
}
public class paramateriz_cons {
    public static void main(String[] args) {
        Student s1=new Student("priya","23");
        s1.printInfo();
        

    }   
}
