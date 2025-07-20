//Time Complexity : O(n*2^n)
// Space Complexity : O(n)
public class FindSubsets {
    public static void printSubsets(String str,String newString,int i){
        // Base Case
        if(i==str.length()){
            System.out.println(newString);
            return;
        } 
       // Recursion
        // Yes choice
        printSubsets(str, newString+str.charAt(i), i+1);
        // No choice
        printSubsets(str, newString, i+1);

    }
    public static void main(String[] args) {
        String str="abc";
        printSubsets(str,"",0);
        
    }
}
