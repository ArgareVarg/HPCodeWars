package net.argvarg;

/**
 * Created by fredrik on 11/10/14.
 */
public class Grid {
    private Row[] x;
    private Column[] y;
    private String[] cameras;

    Grid(int x, int y) {
        this.x = new Row[y];
        this.y = new Column[x];
        cameras = new String[y+2];
        for (int i = 0; i < x; i++) {
            this.x[i] = new Row(x);
        }
        for (int i = 0; i < y; i++) {
            this.y[i] = new Column(x, this.x, i);
        }
    }

    public void setRow (int row, String value) {
        x[row].setRow(value);
    }

    public String getRow (int row) {
        return x[row].getRow();
    }

    public String getColumn (int column) {
        return y[column].getColumn();
    }

    public void setCameras(int camera, String value) {
        cameras[camera] = value;
    }

    public String getCameras(int camera) {
        return cameras[camera];
    }

    public String isMissing (int row) {
        return x[row].isMissing();
    }

    public String isColMissing (int col) {
        return y[col].isMissing();
    }

    public void updateColumns() {
        for (int i = 0; i < y.length; i++) {
            y[i].updateColumn();
        }
    }
}
