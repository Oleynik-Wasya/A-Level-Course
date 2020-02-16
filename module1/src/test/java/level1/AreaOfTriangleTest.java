package level1;

import level1.AreaOfTriangle;
import level1.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfTriangleTest {
    AreaOfTriangle areaOfTriangle;

    @BeforeEach
    void setUp(){
        areaOfTriangle = new AreaOfTriangle();
    }

    @Test
    void testAreaOfTriangle(){
        assertArea(12.5, areaOfTriangle.count(new Point(0, 0), new Point(0, 5), new Point(5, 0)));
        assertArea(0., areaOfTriangle.count(new Point(0, 0), new Point(0, 0), new Point(0, 0)));
        assertArea(12.5, areaOfTriangle.count(new Point(0, 0), new Point(0, -5), new Point(5, 0)));
        assertArea(3., areaOfTriangle.count(new Point(1, 1), new Point(3, 1), new Point(1, 4)));
        assertArea(0., areaOfTriangle.count(new Point(1, 1), new Point(1, 1), new Point(1, 1)));
    }

    void assertArea(double expected, double got){
        assertEquals(expected, got);
    }
}