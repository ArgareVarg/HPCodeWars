package net.argvarg;

/**
 * Created by fredrik on 11/10/14.
 */
public class Row {
    private int length;
    private String row = "";
    private String[] rowSegment;

    Row(int length) {
        this.length = length;
        rowSegment = new String[length];
        for (int i = 0; i < length; i++) {
            row = row + "X";
            rowSegment[i] = "X";
        }
    }

    public String getRow () {
        return row;
    }

    public String getRowSegment (int segment) {
        return rowSegment[segment];
    }

    public void setRow (String row) {
        this.row = row;
        for (int i = 0; i < row.length(); i++) {
            this.rowSegment[i] = String.valueOf(row.charAt(i));
        }
    }

    public String isMissing() {
        String missing = "";
        if (!row.contains("A")) {
            missing = missing + "A";
        }
        if (!row.contains("B")) {
            missing = missing + "B";
        }
        if (!row.contains("C")) {
            missing = missing + "C";
        }
        return missing;
    }
}
