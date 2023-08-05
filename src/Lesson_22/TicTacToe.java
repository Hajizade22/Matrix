package Lesson_22;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';


        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], '-');
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isGameOver() {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return true;
            }
        }


        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return true;
            }
        }


        return (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-');
    }

    public void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public boolean move(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();

        System.out.println("Tic Tac Toe Oyununa Xoş Gəldiniz!");
        System.out.println("Oyun başladı.");

        while (!game.isGameOver() && !game.isBoardFull()) {
            System.out.println("Sıra " + game.currentPlayer + " oyuncusunda.");
            game.printBoard();
            System.out.println("Sətir nömrəsini girin (0-2):");
            int row = scanner.nextInt();
            System.out.println("Sütun nömrəsini girin (0-2):");
            int col = scanner.nextInt();

            if (!game.move(row, col)){
                System.out.println("Təkrar yoxlayın");
            }
            if (!game.isGameOver()){
                game.changePlayer();
            }
        }

        game.printBoard();

        if (game.isGameOver()) {
            System.out.println("Oyun bitti. Qazanan: " + game.currentPlayer);
        } else {
            System.out.println("Oyun bərabərə.");
        }

        scanner.close();
    }
}



