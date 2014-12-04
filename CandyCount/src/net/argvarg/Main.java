package net.argvarg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Main start = new Main();
        start.run();
    }

    public int realNum;
    public int people;
    public int[] guesses;
    public String currLine;
    public String[] names;
    public Scanner reader = new Scanner(System.in);
    public void run() {
        realNum = Integer.parseInt(reader.nextLine());
        people = Integer.parseInt(reader.nextLine());
        guesses = new int[people];
        names = new String[people];
        for (int a = 0; a < people; a++) {
            currLine = reader.nextLine();
            String[] splitLine = currLine.split(" ");
            guesses[a] = Integer.parseInt(splitLine[0]);
            names[a] = splitLine[1];
        }
        getAnswer();
    }

    public void getAnswer() {
        int shortest = Integer.MAX_VALUE;
        List<Integer> mostAccurate = new ArrayList<Integer>();
        for (int a = 0; a < people; a++) {
            if (Math.abs(realNum - guesses[a]) < shortest) {
                shortest = Math.abs(realNum - guesses[a]);
                mostAccurate = new ArrayList<Integer>();
                mostAccurate.add(a);
            } else if (Math.abs(realNum - guesses[a]) == shortest) {
                mostAccurate.add(a);
            }
        }
        for (int b = 0; b < mostAccurate.size(); b++) {
            System.out.print(names[mostAccurate.get(b)] + " ");
        }
    }
}
