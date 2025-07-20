import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
// if not sorted
public class ActivitySelcnProbUnsorted {  //O(nlogn)
    public static void main(String[] args) {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};  
        ArrayList<Integer> list= new ArrayList<>();
        int maxAct=0;
        int activities[][]= new int[start.length][3];

        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //lambda function -> shortform
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));  //O(logn)
        
        //1st Activity
        maxAct=1;
        list.add(activities[0][0]);
        int lastEnd=activities[2][0];
        for(int i=1;i<start.length;i++){
            if(activities[i][1]>=lastEnd){ // non-overlapping
                //activity select
                maxAct++;
                 list.add(activities[i][0]);
               lastEnd=activities[i][2];
            }
        }
        System.out.println("max activities="+maxAct);
        for(int e:list){
            System.out.print("A"+e+" ");
        }


        
    }
    
    
}
