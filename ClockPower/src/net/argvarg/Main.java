package net.argvarg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Main start = new Main();
        start.run();
    }

    public static int nums;
    public String currLine;
    public String totalLine;
    public Scanner reader = new Scanner(System.in);

    public void run() {
        nums = Integer.parseInt(reader.nextLine());
        for (int a = 0; a < nums; a++) {
            int result = 20;
            currLine = reader.nextLine();
            totalLine = currLine.split(":")[0] + currLine.split(":")[1];
            //System.out.println(totalLine);
            int[] nums = new int[totalLine.length()];
            for (int b = 0; b < totalLine.length(); b++) {
                nums[b] = totalLine.charAt(b) - 48;
                //System.out.println(nums[b]);
                result = result + getMilliAmps(nums[b]);
            }
            System.out.println(result + " milliamps");
        }
    }

    public int getMilliAmps(int i) {
        switch(i) {
            case 0: return 6*15;
            case 1: return 2*15;
            case 2: return 5*15;
            case 3: return 5*15;
            case 4: return 4*15;
            case 5: return 5*15;
            case 6: return 6*15;
            case 7: return 3*15;
            case 8: return 7*15;
            case 9: return 8*15;
            default: System.exit(1);
        }
        return 0;
    }
}
