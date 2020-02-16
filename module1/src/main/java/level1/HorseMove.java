package level1;

public class HorseMove {
    boolean isItPossibleToMove(int positionX, int positionY, int moveToX, int moveToY){
        if (positionX + 2 == moveToX && Math.abs(moveToY - positionY) == 1){
            return true;
        }
        if (positionX + 1 == moveToX && Math.abs(moveToY - positionY) == 2){
            return true;
        }
        if (positionX - 1 == moveToX && Math.abs(moveToY - positionY) == 2 ){
            return true;
        }
        if (positionX - 2 == moveToX && Math.abs(moveToY - positionY) == 1){
            return true;
        }
        return false;
    }
}
