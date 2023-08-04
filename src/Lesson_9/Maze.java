package Lesson_9;

import java.util.Scanner;

public class Maze {
    char[][] labirint;
    int oyuncuSetr;
    int oyuncuSutun;
    int sonSetr;
    int sonSutun;

    public Maze(int setr, int sutun) {
        labirint = new char[setr][sutun];
        for (int i = 0; i < setr; i++) {
            for (int j = 0; j < sutun; j++) {
                if (i == 0 || j == 0 || i == setr - 1 || j == sutun - 1) {// 10 olan zaman lenght xeta verdiyinden 1 evvel gotururuk
                    labirint[i][j] = '#';
                } else {
                    labirint[i][j] = ' ';
                }
            }
        }
        oyuncuSetr = 1;
        oyuncuSutun = 1;
        sonSetr = setr - 2;
        sonSutun = sutun - 2;
        labirint[oyuncuSetr][oyuncuSutun] = 'P';
        labirint[sonSetr][sonSutun] = 'E';
    }

    public void oyuncuHereketi(char istiqamet) {
        int yeniSetr = oyuncuSetr;
        int yeniSutun = oyuncuSutun;
        switch (istiqamet) {
            case 'w':
                yeniSetr--;
                break;
            case 's':
                yeniSetr++;
                break;
            case 'a':
                yeniSutun--;
                break;
            case 'd':
                yeniSutun++;
                break;
            default:
                System.out.println("Yalnız w,s,a,d");
                return;
        }
        if (labirint[yeniSetr][yeniSutun] != '#') {
            labirint[oyuncuSetr][oyuncuSutun] = ' ';
            oyuncuSetr = yeniSetr;
            oyuncuSutun = yeniSutun;
            labirint[oyuncuSetr][oyuncuSutun] = 'P';
        } else {
            System.out.println("Divar!.");
        }
    }

    public void print() {
        for (int i = 0; i < labirint.length; i++) {
            for (int j = 0; j < labirint.length; j++) {
                System.out.print(labirint[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maze labirint = new Maze(10, 10);
        labirint.print();
        boolean gameover = true;
        while (gameover) {
            System.out.print(" (w, s, a, d): ");
            char wasd = scanner.next().charAt(0);
            labirint.oyuncuHereketi(wasd);
            labirint.print();
            if (labirint.oyuncuSetr == labirint.sonSetr && labirint.oyuncuSutun == labirint.sonSutun) {
                System.out.println("Təbrikler!");
                gameover = false;
            }
        }
    }

}

