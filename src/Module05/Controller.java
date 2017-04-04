package Module05;

/**
 * Created by user on 21.03.2017.
 */
public class Controller {
    private API[] apis = new API[3];
    private DAOImpl dataBase = new DAOImpl();

    Controller() {
        this.apis[0] = new BookingComAPI();
        this.apis[1] = new GoogleAPI();
        this.apis[2] = new TripAdvisorAPI();
    }

    Room[] requstRooms(int price, int persons, String city, String hotel) {


        Room[] CCC = new Room[0];
        API[] AAA = getApis();
        int BBB = 0;
        for (int i = 0; i < AAA.length; i++) {
            API AAa = AAA[i];
            Room[] Result = AAa.findRooms(price, persons, city, hotel);
            for (int j = 0; j < Result.length; j++) {
                if (Result[j] != null) {
                    Room[] rooms = new Room[BBB + 1];
                    for (int i1 = 0; i1 < CCC.length; i1++) {
                        rooms[i1] = CCC[i1];
                    }
                    rooms[BBB] = Result[j];
                    CCC = rooms;
                    BBB++;
                }
            }
        }
        return CCC;
    }

    Room[] check(API api1, API api2) {
        Room[] AAA = new Room[0];
        Room[] BBB = api1.getRooms();
        Room[] CCC;
        int searchCounter = 0;
        for (Room aRoomsAPI1 : BBB) {
            CCC = api2.findRooms(aRoomsAPI1.getPrice(), aRoomsAPI1.getPersons(), aRoomsAPI1.getCityName(), aRoomsAPI1.getHotelName());
            for (int i = 0; i < CCC.length; i++) {
                if (CCC[i] != null) {
                    Room[] roomsTemp = new Room[searchCounter + 1];
                    for (int i1 = 0; i1 < AAA.length; i1++) {
                        roomsTemp[i1] = AAA[i1];
                    }
                    roomsTemp[searchCounter] = CCC[i];
                    AAA = roomsTemp;
                    searchCounter++;
                }
            }
        }
        return AAA;
    }

    Room save(Room room) {

        return dataBase.save(room);
    }

    boolean delete(Room room) {

        return dataBase.delete(room);
    }

    Room update(Room room) {

        return dataBase.update(room);
    }

    Room findById(long id) {

        return dataBase.findById(id);
    }

    public DAOImpl getDataBase() {
        return dataBase;
    }

    public void setDataBase(DAOImpl dataBase) {
        this.dataBase = dataBase;
    }

    public API[] getApis() {
        return apis;

    }
}
