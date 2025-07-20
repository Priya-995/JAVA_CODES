// Permutations => arrangements
// Total => n!
// Time complexity: O(n*n!)
// Space Complexity : O(n^2)
public class Permutations {
    public static void printPermutations(String str,String ans){
        if(str.length()==0){
          System.out.println(ans);
          return;
        }
        for(int i=0;i<str.length();i++){
            char curr= str.charAt(i);
            String newString=str.substring(0,i)+ str.substring(i+1);
            printPermutations(newString, ans+curr);
        }
       
    }
    public static void main(String[] args) {
        String str="abc";
        printPermutations(str,"");
    }
}
