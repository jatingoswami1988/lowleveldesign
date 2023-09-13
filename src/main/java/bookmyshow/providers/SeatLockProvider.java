package bookmyshow.providers;


import java.util.List;

import bookmyshow.model.Seat;
import bookmyshow.model.Show;

public interface SeatLockProvider {

    void lockSeats(Show show, List<Seat> seat, String user);
    void unlockSeats(Show show, List<Seat> seat, String user);
    boolean validateLock(Show show, Seat seat, String user);

    List<Seat> getLockedSeats(Show show);
}
