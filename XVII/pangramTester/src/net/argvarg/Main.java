package net.argvarg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String input;
        boolean[] isUsed = new boolean[26];
        boolean isPerfect = true;
        boolean isPangram = true;
        boolean notDone = true;
        int curr;
        Scanner reader = new Scanner(System.in);
        input = reader.nextLine().toLowerCase();
        for ( int i = 0; i < input.length(); i ++) {
            char myChar = input.charAt(i);
            curr = (int)myChar;
            curr = curr -97;
            if (curr == -65) {

            } else if (curr < 0) {
            } else if (isUsed[curr]) {
                isPerfect = false;
            } else isUsed[curr] = true;
        }
        System.out.println("finished while loop");

        for (int i = 0; i < 26; i++) {
            if (!isUsed[i]) {
                isPangram = false;
                break;
            }
        }
        if (!isPangram) isPerfect = false;
        System.out.println(input + "\n Is a perfect Pangram: " + isPerfect + "\n is a Pangram: " + isPangram);
    }
}
