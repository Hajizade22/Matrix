package Lesson_14;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BattleshipGame {
    private char[][] playerBoard;
    private char[][] enemyBoard;
    private int boardSize;
    private int numBoats;

    public BattleshipGame(int boardSize, int numBoats) {
        this.boardSize = boardSize;
        this.numBoats = numBoats;
        playerBoard = new char[boardSize][boardSize];
        enemyBoard = new char[boardSize][boardSize];
        initializeBoards();
    }

    public void initializeBoards() {
        for (char[] row : playerBoard) {
            Arrays.fill(row, '~');
        }
        for (char[] row : enemyBoard) {
            Arrays.fill(row, '~');
        }
    }

    public void placeEnemyBoats() {
        Random random = new Random();
        int boatsPlaced = 0;

        while (boatsPlaced < numBoats) {
            int row = random.nextInt(boardSize);
            int col = random.nextInt(boardSize);

            if (enemyBoard[row][col] != 'B') {
                enemyBoard[row][col] = 'B';
                boatsPlaced++;
            }
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Battleship!");

        while (true) {
            System.out.println("\nPlayer's Board:");
            displayBoard(playerBoard);

            System.out.println("\nEnter coordinates to fire at (row column):");
            int row = -1;
            int col = -1;

            while (row < 0 || row >= boardSize || col < 0 || col >= boardSize) {
                String input = scanner.nextLine();
                String[] coordinates = input.split(" ");

                if (coordinates.length != 2) {
                    System.out.println("Invalid input. Try again:");
                    continue;
                }

                try {
                    row = Integer.parseInt(coordinates[0]) - 1;
                    col = Integer.parseInt(coordinates[1]) - 1;

                    if (row < 0 || row >= boardSize || col < 0 || col >= boardSize) {
                        System.out.println("Invalid coordinates. Try again:");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Try again:");
                }
            }

            if (enemyBoard[row][col] == 'B') {
                System.out.println("You hit an enemy boat!");
                playerBoard[row][col] = 'X';
                enemyBoard[row][col] = 'X';
            } else {
                System.out.println("You missed!");
                playerBoard[row][col] = 'O';
            }

            if (checkGameOver()) {
                System.out.println("\nPlayer's Board:");
                displayBoard(playerBoard);
                System.out.println("Congratulations! You won the game!");
                break;
            }

            System.out.println("\nEnemy's turn:");
            enemyTurn();

            if (checkGameOver()) {
                System.out.println("\nPlayer's Board:");
                displayBoard(playerBoard);
                System.out.println("Game over! You lost.");
                break;
            }
        }

        scanner.close();
    }

    public void enemyTurn() {
        Random random = new Random();
        int row;
        int col;

        do {
            row = random.nextInt(boardSize);
            col = random.nextInt(boardSize);
        } while (playerBoard[row][col] == 'X' || playerBoard[row][col] == 'O');

        if (playerBoard[row][col] == 'B') {
            System.out.println("Enemy hit your boat at " + (row + 1) + " " + (col + 1) + "!");
            playerBoard[row][col] = 'X';
        } else {
            System.out.println("Enemy missed at " + (row + 1) + " " + (col + 1) + "!");
            playerBoard[row][col] = 'E';
        }
    }

    public boolean checkGameOver() {
        for (char[] row : enemyBoard) {
            for (char cell : row) {
                if (cell == 'B') {
                    return false;
                }
            }
        }
        return true;
    }

    public void displayBoard(char[][] board) {
        System.out.print("  ");
        for (int i = 0; i < boardSize; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();

        for (int i = 0; i < boardSize; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        BattleshipGame game = new BattleshipGame(5,3);
        game.placeEnemyBoats();
        game.playGame();
    }
}
