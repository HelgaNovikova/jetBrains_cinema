package cat.domainmodel;

import java.util.ArrayList;
import java.util.List;

public class Seats {

    private final int numOfRows;
    private final int numOfColumns;

    private List<Seat> seats;

    public Seats(int numOfRows, int numOfColumns, List<Seat> seats) {
        this.numOfRows = numOfRows;
        this.numOfColumns = numOfColumns;
        this.seats = seats;
    }

    public List<Seat> getSeats() {
        return seats;
    }


}
