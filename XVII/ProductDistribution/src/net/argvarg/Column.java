package net.argvarg;

/**
 * Created by fredrik on 11/10/14.
 */
public class Column {
    private Row[] rows;
    private int rowsNum;
    private int columNum;
    private String column = "";

    Column(int rowsNum, Row[] rows, int columNum) {
        this.rows = rows;
        this.rowsNum = rowsNum;
        this.columNum = columNum;
        for (int i = 0; i < rowsNum; i++) {
            column = column + rows[i].getRow().charAt(columNum);
        }
    }

    public String getColumn () {
        String value = "";
        for (int i = 0; i < rowsNum; i++) {
            value = value + String.valueOf(rows[i].getRow().charAt(columNum));
        }
        return value;
    }

    public void updateColumn() {
        column = "";
        for (int i = 0; i < rowsNum; i++) {
            column = column + rows[i].getRow().charAt(columNum);
        }
    }

    public String isMissing() {
        String missing = "";
        if (!column.contains("A")) {
            missing = missing + "A";
        }
        if (!column.contains("B")) {
            missing = missing + "B";
        }
        if (!column.contains("C")) {
            missing = missing + "C";
        }
        return missing;
    }
}
