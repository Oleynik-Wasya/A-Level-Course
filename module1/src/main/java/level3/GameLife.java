package level3;

public class GameLife {
    void live(int[][] world) {
        for (int i = 1; i < world.length - 1; i++) {
            for (int j = 1; j < world[0].length - 1; j++) {
                if (world[i][j] == 1) {
                    if (countNeighbors(world, i, j) < 2) {
                        world[i][j] = 0;
                    }
                    if (countNeighbors(world, i, j) > 3) {
                        world[i][j] = 0;
                    }
                } else {
                    if (countNeighbors(world, i, j) == 3) {
                        world[i][j] = 1;
                    }
                }

            }
        }
    }

    private static int countNeighbors(int[][] world, int x, int y) {
        int count = 0;
        if (world[x + 1][y] == 1) {
            count++;
        }
        if (world[x - 1][y] == 1) {
            count++;
        }
        if (world[x][y + 1] == 1) {
            count++;
        }
        if (world[x][y - 1] == 1) {
            count++;
        }
        if (world[x + 1][y + 1] == 1) {
            count++;
        }
        if (world[x + 1][y - 1] == 1) {
            count++;
        }
        if (world[x - 1][y + 1] == 1) {
            count++;
        }
        if (world[x - 1][y - 1] == 1) {
            count++;
        }
        return count;
    }

    public static void show(int[][] world){
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {
                System.out.print(world[i][j] + " ");
            }
            System.out.println();
        }
    }
}
