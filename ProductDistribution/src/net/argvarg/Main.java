package net.argvarg;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class Main {

    public int debugLevel = 5;
    public static void main(String[] args) {
	    Main start = new Main();
        start.run();
    }

    public Scanner reader = new Scanner(System.in);
    public String currLine;
    public Grid myGrid;
    public int lines;
    public Grid cameraGrid;
    public LogHelper logger = new LogHelper(debugLevel);
    public void run() {
        currLine = reader.nextLine();
        lines = Integer.parseInt(currLine);
        myGrid = new Grid(lines, lines);
        for (int a = 0; a <= lines + 1; a++) {
            currLine = reader.nextLine();
            logger.putLog(currLine, 3);
            myGrid.setCameras(a, currLine);
        }
        computeCameras();
        getRealRow();
        for (int i = 0; i < lines; i++) {
            System.out.println(myGrid.getRow(i));
        }
    }

    public void getRealRow() {
        boolean notFoundSolution = true;
        while (notFoundSolution) {
            boolean isdone = true;
            for (int a = 0; a < lines; a++) {
                if (cameraGrid.isMissing(a).length() != 0) {
                    isdone = false;
                    if (cameraGrid.isMissing(a).length() == 1) {
                        for (int b = 0; b < lines; b++) {
                            if (myGrid.isColMissing(b).contains(cameraGrid.isMissing(a))) {
                                String newrow = cameraGrid.getRow(a);
                                newrow = newrow.substring(0, b) + cameraGrid.isMissing(a) + newrow.substring(b+1);
                                cameraGrid.setRow(a, newrow);
                                myGrid.setRow(a, newrow);
                                cameraGrid.updateColumns();
                                myGrid.updateColumns();
                            }
                        }
                    }
                } else
                    myGrid.setRow(a, cameraGrid.getRow(a));
            }
            if (isdone == true) notFoundSolution = false;
        }
    }

    public void computeCameras() {
        for (int i = 0; i <= lines + 1; i++) {
            String output = "";
            if (i == 0) {
                if (myGrid.getCameras(0).charAt(0) == 'X') {
                    output = String.valueOf(myGrid.getCameras(1).charAt(0));
                } else {
                    output = String.valueOf(myGrid.getCameras(0).charAt(0));
                }

                output = output + String.valueOf(myGrid.getCameras(0).charAt(1));

                if (myGrid.getCameras(0).charAt(0) == 'X') {
                    output = output + String.valueOf(myGrid.getCameras(0).charAt(1));
                } else {
                    output = output + String.valueOf(myGrid.getCameras(0).charAt(2));
                }
                cameraGrid.setRow(0, output);
            } else if (i == lines) {
                if (myGrid.getCameras(0).charAt(lines) == 'X') {
                    output = String.valueOf(myGrid.getCameras(lines-1).charAt(0));
                } else {
                    output = String.valueOf(myGrid.getCameras(lines).charAt(0));
                }

                output = output + String.valueOf(myGrid.getCameras(lines).charAt(1));

                if (myGrid.getCameras(0).charAt(lines) == 'X') {
                    output = output + String.valueOf(myGrid.getCameras(lines-1).charAt(1));
                } else {
                    output = output + String.valueOf(myGrid.getCameras(lines).charAt(2));
                }
                cameraGrid.setRow(lines - 2, output);
            } else if ((i != 1) && (i != lines-1)) {
                output = String.valueOf(myGrid.getCameras(i).charAt(0));
                for (int b = 0; b < lines - 2; b++) {
                    output = output + "X";
                }
                output = String.valueOf(myGrid.getCameras(i).charAt(1));
                cameraGrid.setRow(i - 1, output);
            }
            cameraGrid.updateColumns();
        }
    }
}
