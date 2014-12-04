package net.argvarg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main start = new Main();
        start.run();
    }

    public Scanner reader = new Scanner(System.in);
    public int input;
    public void run() {
        while (true) {
            input = Integer.parseInt(reader.nextLine());
            if (input == 0) System.exit(0);
            System.out.println(input + " " + getBees(input));
        }
    }

    public int getBees(int inputNum) {
        return (int)Math.round(100*Math.sqrt(inputNum) + 201/(inputNum + 1) + 1);
    }
}
