package level1;

public class Main {
    public static void main(String[] args) {
        CountUnique countUnique = new CountUnique();
        System.out.println(countUnique.count(new int[]{1, 2, 3, 4, 2, 3, 4, 1, 4, 23}));

        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        double result  = areaOfTriangle.count(new Point(0, 0), new Point(0, 5), new Point(5, 0));
        System.out.println(result);
    }
}
