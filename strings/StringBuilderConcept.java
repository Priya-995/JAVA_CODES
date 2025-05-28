public class StringBuilderConcept {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("");
        for(char ch='a';ch<='z';ch++){  // O(26)
            sb.append(ch);
        }
        // if we use String then complexity : O(n^2) ;by using + operator
        System.out.println(sb);
    }
}
