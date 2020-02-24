package level3;

import java.util.ArrayList;

public class GameLife {

    private class Survives {
        ArrayList<Integer> X;
        ArrayList<Integer> Y;

        Survives() {
            X = new ArrayList<>();
            Y = new ArrayList<>();
        }
    }

    public void live(int[][] world) {
        perform(world, check(world));
    }

    private Survives check(int[][] world) {
        Survives survives = new Survives();
        for (int i = 1; i < world.length - 1; i++) {
            for (int j = 1; j < world[0].length - 1; j++) {
                if (world[i][j] == 1) {
                    if (countNeighbors(world, i, j) == 2 || countNeighbors(world, i, j) == 3) {
                        survives.X.add(i);
                        survives.Y.add(j);
                    }
                } else {
                    if (countNeighbors(world, i, j) == 3) {
                        survives.X.add(i);
                        survives.Y.add(j);
                    }
                }
            }
        }
        return survives;
    }

    private void perform(int[][] world, Survives survives) {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {
                world[i][j] = 0;
            }
        }
        for (int i = 0; i < survives.X.size(); i++) {
            world[survives.X.get(i)][survives.Y.get(i)] = 1;
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

    public static void show(int[][] world) {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {
                System.out.print(world[i][j] + " ");
            }
            System.out.println();
        }
    }
}
