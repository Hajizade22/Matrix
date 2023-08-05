package Lesson_8;

import java.util.Scanner;

public class PlayerHomeWork {
    public static void main(String[] args) {
        String[] word = {"rock", "paper", "scissors"};
        String myName = "Yusif";
        String name2Player = "Computer";
        int round = 1;
        int myScore = 0;
        int player2Score = 0;
        boolean gameOn = true;
        Scanner scanner = new Scanner(System.in);
        while (gameOn) {
            String player2Choice = word[(int) (Math.random() * word.length)];
            System.out.println(myName + " vs " + name2Player);
            System.out.println("Round : " + round);
            System.out.println("Please enter your choice: ");
            String myChoice = scanner.nextLine();
            if (myChoice.equals(player2Choice)) {
                System.out.println("Tie");
            } else if (myChoice.equals(word[0]) && player2Choice.equals(word[2])) {
                System.out.println(myName + " " + (myScore + 1) + " " + name2Player + " (" + player2Choice + ") " + player2Score);
                myScore++;
            } else if (myChoice.equals(word[1]) && player2Choice.equals(word[0])) {
                System.out.println(myName + " " + (myScore + 1) + " " + name2Player + " (" + player2Choice + ") " + player2Score);
                myScore++;
            } else if (myChoice.equals(word[2]) && player2Choice.equals(word[1])) {
                System.out.println(myName + " " + (myScore + 1) + " " + name2Player + " (" + player2Choice + ") " + player2Score);
                myScore++;
            } else {
                System.out.println(myName + " " + myScore + " " + name2Player + " (" + player2Choice + " ) " + (player2Score + 1));
                player2Score++;
            }
            System.out.println("Do you want to play again? (yes or no)");
            String playAgain = scanner.nextLine();
            if (playAgain.equals("yes")) {
                round++;
            } else {
                gameOn = false;
                if (myScore > player2Score) {
                    System.out.println(myName + ": " + myScore + " " + name2Player + ": " + player2Score);
                    System.out.println(myName + " Win");
                } else if (myScore < player2Score) {
                    System.out.println(myName + ": " + myScore + " " + name2Player + ": " + player2Score);
                    System.out.println(name2Player + " Win");
                } else {
                    System.out.println("Tie");
                }
            }
        }
    }
}


