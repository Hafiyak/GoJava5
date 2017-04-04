package Module05;

/**
 * Created by user on 20.03.2017.
 */
public abstract class AbstractAPI implements API {

    private Room[] rooms;

    @Override
    public  Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] roomsFound = new Room[5];
        Room[] apiRooms = getRooms();

        int roomsPrice;
        int roomsPersons;
        String roomsCity;
        String roomsHotel;

        int searchCounter = 0;
        for (int i = 0; i < apiRooms.length; i++) {

            roomsPrice = apiRooms[i].getPrice();
            roomsPersons = apiRooms[i].getPersons();
            roomsCity = apiRooms[i].getCityName();
            roomsHotel = apiRooms[i].getHotelName();

            if (price == roomsPrice && persons == roomsPersons &&
                    city.equals(roomsCity) && hotel.equals(roomsHotel)) {

                roomsFound[searchCounter] = apiRooms[i];
                searchCounter++;
            }
        }
        return roomsFound;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }
}
