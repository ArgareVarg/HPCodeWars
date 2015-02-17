package net.argvarg;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static boolean BLACK = true;
    public static boolean WHITE = false;
    public static Boolean NONE = null;
    Boolean[][] board = new Boolean[8][8];
    ArrayList<String> input = new ArrayList<String>();

    public static void main(String[] args) {
	    Main start = new Main();
        start.run();
    }

    public void run () {
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++) {
                board[a][b] = null;
            }
        }

        //setting up the board
        board[4][4] = WHITE;
        board[4][5] = BLACK;
        board[5][4] = WHITE;
        board[5][5] = BLACK;


        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        do {
            input.add(line);
            line = sc.nextLine();
        } while (!line.equals("END"));

        executeInput();
    }

    public void executeInput() {
        int index = 0;
        String line = input.get(index);
        while (line.length() < 3) {
            
        }
    }

    public void printBoard(Boolean[][] board) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(getToken(board[row][col]));
            }
            System.out.print("\n");
        }
    }

    public char getToken(Boolean b) {
        if (b == NONE) {
            return '.';
        } else return b == BLACK ? 'B' : 'W';
    }
}
