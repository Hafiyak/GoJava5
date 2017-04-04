package Module05;

/**
 * Created by user on 21.03.2017.
 */
public class GoogleAPI extends AbstractAPI{
        public GoogleAPI() {
                Room[] roomsSet = new Room[5];
                roomsSet[0] = new Room(1006L, 55, 1, 2017, 05, 01, "Lviv", "Lviv");
                roomsSet[1] = new Room(1007L, 65, 2, 2017, 05, 01, "Lviv", "Lviv");
                roomsSet[2] = new Room(1011L, 75, 3, 2017, 05, 01, "Lviv", "Lviv");
                roomsSet[3] = new Room(1012L, 85, 4, 2017, 05, 01, "Lviv", "Lviv");
                roomsSet[4] = new Room(1010L, 95, 5, 2017, 05, 01, "Lviv", "Lviv");
                this.setRooms(roomsSet);
        }
}

