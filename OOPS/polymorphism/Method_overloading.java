
public class Method_overloading {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2,3));
        System.out.println(cal.sum(2,3,8));
        System.out.println(cal.sum(2.9f,3.8f));

    }
}

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {  // data types are different
        return a + b;
    }

    int sum(int a, int b, int c) {  // no. of parameters => different 
        return a + b + c;
    }
    // the below code is not acceptable coz u just flips both of them => as the rule says data types must be different
    // int sum(int b, int a){  // for difference in order 
    //     return b+a;
    // }
    // Note : difference in order doesn't mean flips b,a with same data types => to make this happen the data types must be different
    //Example 
    void sum(int a, String b) {   
        System.out.println("its sum");
    }
    
   // this would be acceptable =>  now 
    void sum(String a, int b){
       System.out.println("it's me");
    }


}
