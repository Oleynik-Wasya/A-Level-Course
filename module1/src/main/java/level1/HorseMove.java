package level1;

public class HorseMove {
    boolean isItPossibleToMove(int positionX, int positionY, int moveToX, int moveToY) {
        int rowMove = Math.abs(positionX - moveToX);
        int columnMove = Math.abs(positionY - moveToY);
        return (rowMove == 1 && columnMove == 2) || (rowMove == 2 && columnMove == 1);
    }
}
