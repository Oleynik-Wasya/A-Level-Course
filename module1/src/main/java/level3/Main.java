package level3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int[][] arr = {{0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0}};
        GameLife.show(arr);
        System.out.println();
        GameLife gameLife = new GameLife();
        gameLife.live(arr);
        GameLife.show(arr);
    }
}
