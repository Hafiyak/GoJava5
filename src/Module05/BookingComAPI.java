package Module05;

import java.awt.print.Book;

/**
 * Created by user on 21.03.2017.
 */
public class BookingComAPI extends AbstractAPI {
    public BookingComAPI() {
    Room[] roomsSet = new Room[5];
    roomsSet[0] = new Room(1001L, 15, 1, 2017, 1, 1, "Kilikia", "Uzghorod");
    roomsSet[1] = new Room(1002L, 25, 2, 2017, 2, 2, "Kilikia", "Uzghorod");
    roomsSet[2] = new Room(1003L, 35, 3, 2017, 3, 3, "Kilikia", "Uzghorod");
    roomsSet[3] = new Room(1004L, 45, 4, 2017, 4, 4, "Kilikia", "Uzghorod");
    roomsSet[4] = new Room(1005L, 50, 5, 2017, 5, 5, "Kilikia", "Uzghorod");
        this.setRooms(roomsSet);
}


}
