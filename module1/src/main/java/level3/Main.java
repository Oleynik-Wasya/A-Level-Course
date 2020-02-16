package level3;

import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int rows = 10;
        int cols = 10;
        int[][] arr = new int[rows][cols];

        Random random = new Random();

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                arr[i][j] = Math.abs(random.nextInt() % 2);
            }
        }
        GameLife gameLife = new GameLife();
        for (int j = 0; j < 200; j++) {
            GameLife.show(arr);
            Thread.sleep(50);
            gameLife.live(arr);
            System.out.print("\n".repeat(200));
        }
        GameLife.show(arr);
    }
}
