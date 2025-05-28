import Student;

package constructor;
public class copy_cons {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="priya";
        s1.roll=23;
        s1.password="hps";
        s1.marks[0]=20;
        s1.marks[1]=90;
        s1.marks[2]=100;

       
        Student s2=new Student(s1);
        s2.password="harshdeep";
        s2.marks[2]=78;    // shallow copy => means any change in s2 object in marks array reflects in both s2 and s1 marks arrays.
        s2.printInfo();
        System.out.println();
        s1.printInfo();
    }   
    
    
}
class Student{
    String name;
    int roll;
    String password;
    int[] marks;
    public void printInfo(){
        System.out.println("Name="+this.name);
        System.out.println("Roll No.="+this.roll);
        System.out.println("Password="+this.password);
        for(int i=0;i<3;i++){
          System.out.print(this.marks[i]+" ");
        }

    }
    //  shallow copy constructor
    // Student(Student s1){  // copy constructor  { we copy s1 properties in s2 object except password only}
    //     marks=new int[3];
    //    this.name=s1.name;
    //    this.roll=s1.roll;
    //    this.marks=s1.marks;
    // }
    
    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){  // now => no change reflect in s1 marks obj 
            this.marks[i]=s1.marks[i];
        }
    }
    Student(){
        marks=new int[3];
      System.out.println("constructor is called....!");
    }
}

