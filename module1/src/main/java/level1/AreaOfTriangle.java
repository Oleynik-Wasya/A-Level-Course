package level1;

public class AreaOfTriangle {
    double count(Point A, Point B, Point C) {
        return Math.abs(((A.getX() - C.getX()) * (B.getY() - C.getY()) - (A.getY() - C.getY()) * (B.getX() - C.getX())) / 2);
    }
}
