import java.util.Scanner;
public class StringIntro {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Input String
        String obj=sc.nextLine();
        //Output
        System.out.println(obj);
        
        // Declaration : two ways
        String s= new String("priya");  // Way 1
        String str= "hey";
        System.out.println(str);
        System.out.println(s);
        // To get length of String
        System.out.println(obj.length());// add parentheses at last .. coz this is a method in String
        // String Concatenation
        String add=str+s;// +: Concatenation
        System.out.println(add);


    }
}
