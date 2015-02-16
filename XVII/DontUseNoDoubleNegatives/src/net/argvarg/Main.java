package net.argvarg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Main start = new Main();
        start.run();
    }

    public String sentence;
    public int negatives;
    public Scanner reader = new Scanner(System.in);
    public void run() {
        while (true) {
            sentence = reader.nextLine();
            if (sentence.equals(".")) System.exit(0);
            negatives = getNegatives();
            System.out.println(negatives + ": " + sentence);
        }
    }

    public int getNegatives() {
        int negativesCount = 0;
        negativesCount = negativesCount + sentence.split(" DON'T ").length - 1;
        negativesCount = negativesCount + sentence.split(" CAN'T ").length - 1;
        negativesCount = negativesCount + sentence.split(" ISN'T ").length - 1;
        negativesCount = negativesCount + sentence.split(" HAVEN'T ").length - 1;
        negativesCount = negativesCount + sentence.split(" CANNOT ").length - 1;
        negativesCount = negativesCount + sentence.split(" WOULDN'T ").length - 1;
        negativesCount = negativesCount + sentence.split(" COULDN'T ").length - 1;
        negativesCount = negativesCount + sentence.split(" WON'T ").length - 1;
        negativesCount = negativesCount + sentence.split(" NO ").length - 1;
        negativesCount = negativesCount + sentence.split(" NOT ").length - 1;
        negativesCount = negativesCount + sentence.split(" NEVER ").length - 1;
        negativesCount = negativesCount + sentence.split(" NOBODY ").length - 1;
        negativesCount = negativesCount + sentence.split(" NOWHERE ").length - 1;
        negativesCount = negativesCount + sentence.split(" NEITHER ").length - 1;
        negativesCount = negativesCount + sentence.split(" AIN'T ").length - 1;
        return negativesCount;
    }
}
