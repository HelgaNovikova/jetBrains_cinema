package cat.domainmodel;

public class Seat {

    public int getRowNumber() {
        return rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    private int rowNumber;

    private int columnNumber;

    public Seat(int rowNumber, int columnNumber) {
        this.columnNumber = columnNumber;
        this.rowNumber = rowNumber;
    }
}
