public class CheckPalindrome {
    public static boolean checkPalindromeOrNot_1(String str){
        int fp=0;
        int lp=str.length()-1;
        while(fp<lp){
            if(str.charAt(fp)!=str.charAt(lp)){
                System.out.println("Not palindrome");
                return false;
            }
            fp++;
            lp--;
        }
        System.out.println("Palindrome");
        return true;

    }
    public static boolean checkPalindromeOrNot_2(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("Not palindrome");
                return false;
            }
          
        }
        System.out.println("Palindrome");
        return true;

    }
    public static void main(String[] args) {
        String str="12123";
        checkPalindromeOrNot_1(str);
        // for numbers
        // int num = 12121;
        //String str = Integer.toString(num);
    }
}
