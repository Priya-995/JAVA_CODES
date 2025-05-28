
import java.util.Arrays;

// we are going to print largest string in lexicographically order
public class printLargest {
  public static void main(String[] args) {
      String words[]={"aabc","ccde","aabcc"};
      // Way:1
      Arrays.sort(words);
      System.out.println("Largest string: "+words[words.length-1]);
      // Way :2
      String largest=words[0];
      for(int i=1;i<words.length;i++){
        if(words[i].compareTo(largest)>0){
           largest=words[i];
        }
      }
      System.out.println(largest);


  }
}
