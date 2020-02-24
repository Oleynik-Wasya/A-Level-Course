package com.alevel.java.nix.hometasks.task6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class TicTacToe {
    private int[][] grid;

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    private static final Logger logger = LoggerFactory.getLogger(TicTacToe.class);

    void play() {
        boolean flag = true;
        while (!isGameOver()){
            logger.info("START GAME!");
            printGrid();
            Scanner scanner = new Scanner(System.in);
            System.out.format("The %s have to move!", flag ? "first" : "second");
            logger.info("The " + (flag ? "first" : "second") + " is moving!");
            System.out.print("\nX: ");
            int x = scanner.nextInt();
            System.out.print("Y: ");
            int y = scanner.nextInt();
            if (!validate(x, y)){
                System.out.println("You can't move there. You lost you move!");
            }
            move(x, y, flag ? 1 : -1);
            flag = !flag;
        }
        logger.info(checkWinner() == 0 ? "DRAW" : checkWinner() == -1 ? "THE SECOND PLAYER WON!" : "THE FIRST PLAYER WON!");
    }

    TicTacToe() {
        grid = new int[3][3];
    }

    private void printGrid(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print((grid[i][j] == 0 ? " " : grid[i][j] == 1 ? "X" : "O"));
            }
            System.out.println();
        }
    }

    void move(int x, int y, int mark) {
        if (validate(x, y)) {
            grid[x][y] = mark;
        }
    }

    private boolean validate(int x, int y) {
        return grid[x][y] == 0;
    }

    private boolean isGameOver() {
        if (!isEmptySpaceExist()) {
            return true;
        }
        return checkWinner() == 1 || checkWinner() == -1;
    }

    boolean isEmptySpaceExist() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    int checkWinner() {
        if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0]) {
            return grid[0][0];
        }
        if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2]) {
            return grid[0][2];
        }
        if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2]) {
            return grid[0][0];
        }
        if (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2]) {
            return grid[2][0];
        }
        if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            return grid[0][0];
        }
        if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
            return grid[0][2];
        }
        return 0;
    }
}
