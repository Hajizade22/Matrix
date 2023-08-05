package Lesson_22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGUI extends JFrame {
    private JButton[][] buttons;
    private char[][] board;
    private char currentPlayer;

    public TicTacToeGUI() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new GridLayout(3, 3));

        buttons = new JButton[3][3];
        board = new char[3][3];
        currentPlayer = 'X';

        initializeButtons();
        initializeBoard();

        setVisible(true);
    }

    private void initializeButtons() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 60));
                buttons[i][j].addActionListener(new ButtonClickListener(i, j));
                add(buttons[i][j]);
            }
        }
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void makeMove(int row, int col) {
        buttons[row][col].setText(String.valueOf(currentPlayer));
        buttons[row][col].setEnabled(false);
        board[row][col] = currentPlayer;
        changePlayer();
        checkGameOver();
    }

    private void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    private void checkGameOver() {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                gameOver(board[i][0]);
                return;
            }
        }


        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                gameOver(board[0][j]);
                return;
            }
        }


        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-')) {
            gameOver(board[1][1]);
            return;
        }


        if (isBoardFull()) {
            gameOver('-');
        }
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private void gameOver(char winner) {
        String message;
        if (winner == '-') {
            message = "Oyun bərabərə!";
        } else {
            message = "Oyun bitti. Qazanan: " + winner;
        }
        JOptionPane.showMessageDialog(this, message);
        resetGame();
    }

    private void resetGame() {
        initializeBoard();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
            }
        }
        currentPlayer = 'X';
    }

    private class ButtonClickListener implements ActionListener {
        private int row;
        private int col;

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            makeMove(row, col);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGUI();
            }
        });
    }
}

