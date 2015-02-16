package net.argvarg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Main start = new Main();
        start.run();
    }

    public static int codeNums;
    public Scanner reader = new Scanner(System.in);
    public String currLine;
    public String[] splitLine;
    public int[] currNums = new int[11];
    public int[] results;

    public void run() {
        codeNums = Integer.parseInt(reader.nextLine());
        results = new int[codeNums];
        for (int i = 0; i < codeNums; i++) {
            currLine = reader.nextLine();
            splitLine = currLine.split(" ");
            for (int a = 0; a < 11; a++) {
                currNums[a] = Integer.parseInt(splitLine[a]);
                System.out.print(currNums[a] + " ");
            }
            results[i] = getResult(currNums);
            System.out.println(results[i]);
        }
    }

    public int getResult(int[] upc) {
        int odds = 0;
        int evens = 0;
        int mod10;
        int result = 0;
        for (int i = 0; i < 6; i++) {
            odds = odds + upc[i*2];
            if (i != 5)
                evens = evens + upc[i*2 + 1];
        }
        mod10 = ((odds*3) + evens)%10;
        if (mod10 != 0) {
            result = 10 - mod10;
        }
        return result;
    }
}
