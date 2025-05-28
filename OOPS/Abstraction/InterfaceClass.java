public class InterfaceClass { // PascalConvention
    public static void main(String[] args) {
        Queen q= new Queen();
        q.moves();
        
    }
}
interface ChessPlayer{ // PascalConvention
   void moves();
}   
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal");
    }
}
class Rook implements ChessPlayer{ // elephant
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
class Pawn implements ChessPlayer{ // pyada
    public void moves(){
        System.out.println("forward, diagonal");
    }
}


