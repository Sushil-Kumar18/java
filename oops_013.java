public class oops_013 {

    // This is the code for interfaces
    public static void main(String[] args) {
        Hook h1 = new Hook();
        h1.moves();
        Queen q1 = new Queen();
        q1.moves();
        
    }
    
}
interface Chessplayer{
    void moves();
}
class Hook implements Chessplayer{
    public void moves(){
        System.out.println("up, down, right, left in all four direction");
    }
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal in all four direction");
    }
}

class pawn implements Chessplayer{
    public void moves(){
        System.out.println("moves one move up , down , right, left");
    }
}
