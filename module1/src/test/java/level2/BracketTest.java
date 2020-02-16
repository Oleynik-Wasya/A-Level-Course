package level2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketTest {

    Bracket bracket;
    @BeforeEach
    void setUp(){
        bracket = new Bracket();
    }

    @Test
    void testBracket(){
        assertIsBracketsPossible(true, bracket.isBracketsPossible("({[]})"));
        assertIsBracketsPossible(true, bracket.isBracketsPossible("((()))"));
        assertIsBracketsPossible(true, bracket.isBracketsPossible("{}"));
        assertIsBracketsPossible(false, bracket.isBracketsPossible("({}}"));
        assertIsBracketsPossible(false, bracket.isBracketsPossible("([{})]"));
        assertIsBracketsPossible(false, bracket.isBracketsPossible("(({]}))"));
    }

    void assertIsBracketsPossible(boolean expected, boolean got){
        assertEquals(expected, got);
    }
}