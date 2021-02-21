import pkg.*;

public class PieceLogic {

    Rectangle pieces;
    MouseController mouse;

    public PieceLogic() {

    }

    public PieceLogic(MouseController mouse, Rectangle pieces) {
        this.mouse = mouse;
        this.pieces = pieces;
    }

//    public Boolean isValidMove(Rectangle subPiece) {
//        if(subPiece.aware())
//            return true;
//        return false;
//    }
}
