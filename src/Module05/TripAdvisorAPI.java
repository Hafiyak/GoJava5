package Module05;

/**
 * Created by user on 21.03.2017.
 */
public class TripAdvisorAPI extends AbstractAPI {

    public TripAdvisorAPI() {
        Room[] roomsSet = new Room[5];
        roomsSet[0] = new Room(1012, 400, 1, 2017, 06, 2, "Mama", "Odessa");
        roomsSet[1] = new Room(1013, 200, 2, 2017, 06, 4, "Mama", "Odessa");
        roomsSet[2] = new Room(1014, 600, 3, 2017, 06, 6, "Mama", "Odessa");
        roomsSet[3] = new Room(1015, 400, 4, 2017, 06, 8, "Mama", "Odessa");
        roomsSet[4] = new Room(1016, 500, 5, 2017, 06, 10, "Mama", "Odessa");
        this.setRooms(roomsSet);
    }
}
