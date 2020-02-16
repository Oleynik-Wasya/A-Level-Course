package level1;

import level1.HorseMove;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorseMoveTest {
    HorseMove horseMove;

    @BeforeEach
    void setUp(){
        horseMove = new HorseMove();
    }

    @Test
    void testHorseMove(){
        assertIsItPossibleToMove(true, horseMove.isItPossibleToMove(3, 4, 2, 6));
        assertIsItPossibleToMove(true, horseMove.isItPossibleToMove(3, 4, 5, 5));
        assertIsItPossibleToMove(false, horseMove.isItPossibleToMove(3, 4, 2, 7));
        assertIsItPossibleToMove(false, horseMove.isItPossibleToMove(3, 4, 22, 6));
    }

    void assertIsItPossibleToMove(boolean expected, boolean got){
        assertEquals(expected, got);
    }
}