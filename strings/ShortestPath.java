public class ShortestPath {
    public static float getShortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            // get direction
            char dir=path.charAt(i);

            //South
            if(dir=='S'){
                y--;
            }
            //North
            else if(dir=='N'){
              y++;
            }
            //East
            else if(dir=='E'){
                x++;
            }
            //West
            else{
              x--;
            }
           
          
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
        

    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
       System.out.println( getShortestPath(path));

    }
}
