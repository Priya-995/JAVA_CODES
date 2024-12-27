// Recursive function to generate all permutations of a string using backtracking
// The function explores all possible permutations by recursively calling itself with
// different substrings and permutations, and backtracks to previous calls when it
// reaches a base case (i.e., when the substring is empty).
//Time complexity=> O(n!) 
// beacause n , n-1, n-2.........
public class permutationsSTr {
    public static void printPermutations(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
          char currChar=str.charAt(i);
          String newStr=str.substring(0,i)+str.substring(i+1);
          printPermutations(newStr,permutation+currChar);
        }
       
    }
    public static void main(String[] args) {
        String str="abc";
        printPermutations(str,"");
    }
}
