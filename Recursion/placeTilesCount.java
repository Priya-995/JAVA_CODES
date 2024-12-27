// we can place the tiles in two ways => horizontal or vertical
// so here we count how many ways the tiles can placed 
// to solve this question we use backtracking
public class placeTilesCount {
    public static int placeTiles(int n, int m){
        if(n<m) return 1;
        if(n==m) return 2;
      int verPlacement=placeTiles(n-m,m);
      int horPlacement=placeTiles(n-1,m);
      return verPlacement+horPlacement;
    }
    public static void main(String[] args) {
        System.out.println(placeTiles(4,2));
    }
}
