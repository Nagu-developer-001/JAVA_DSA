public class InterfaceImplement{
    public static void main(String[] args) {
        Queen qq = new Queen();
        qq.moves();
    }
}

interface ChessPlayer{
    abstract void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("The Queen moves in up,down,right,left,in a horizontal way");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("The Rook moves in Horizontal way");
    }
}
class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("The Pawn moves only in upward Direction!");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("The king moves in every direction by 1 Step expect Horizontal way");
    }
}