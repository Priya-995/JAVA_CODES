// StaticKeyword.java
public class StaticKeyword {
    public static void main(String[] args) {
        // Creating first Student object
        Student s1 = new Student();
        s1.schoolName = "JKS";  // Modifying static variable
        s1.setName("Priya");    // Setting instance variable (name)
        
        // Printing details of s1
        System.out.println(s1.getName());  // Output: Priya
        System.out.println(s1.schoolName); // Output: JKS

        // Creating second Student object
        Student s2 = new Student();
        s2.schoolName = "DKS";  // Modifying static variable again
        
        // Printing details of s2
        System.out.println(s2.schoolName); // Output: DKS
        
        // Checking the value of schoolName in s1
        System.out.println(s1.schoolName); // Output: DKS (same as s2)

        // ❗ Notice: Changing schoolName in s2 also changes it for s1 because it's static
    }
}

class Student {
    String name;  // Instance variable (separate for each object)
    int roll;     // Instance variable

    static String schoolName;  // 🔹 Static variable (shared among all objects)

    // Setter for name (Instance method)
    void setName(String name) {
        this.name = name;
    }

    // Getter for name (Instance method)
    String getName() {
        return this.name;
    }
}
