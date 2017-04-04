package FinalProect.Objects;

/**
 * Created by user on 31.03.2017.
 */
public class Room {
    private long roomId;
    private int persons;
    private double price;
    private int hotelID;
    private boolean hasAdditionalService;
    private double discount;
    private User userReserved;

    public Room(long roomId, int persons, double price, int hotelID, boolean hasAdditionalService, double discount, User userReserved) {
        this.roomId = roomId;
        this.persons = persons;
        this.price = price;
        this.hotelID = hotelID;
        this.hasAdditionalService = hasAdditionalService;
        this.discount = discount;
        this.userReserved = userReserved;
    }

    @Override
    public String toString() {
        return "Room Number = " + roomId +
                ", Persons = " + persons +
                ", Price (original) = " + price +
                ", AdditionalServices = " + hasAdditionalService +
                ", Discount = " + discount + "%";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (roomId != room.roomId) return false;
        if (persons != room.persons) return false;
        if (Double.compare(room.price, price) != 0) return false;
        if (hotelID != room.hotelID) return false;
        if (hasAdditionalService != room.hasAdditionalService) return false;
        if (Double.compare(room.discount, discount) != 0) return false;
        return userReserved != null ? userReserved.equals(room.userReserved) : room.userReserved == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (roomId ^ (roomId >>> 32));
        result = 31 * result + persons;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + hotelID;
        result = 31 * result + (hasAdditionalService ? 1 : 0);
        temp = Double.doubleToLongBits(discount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (userReserved != null ? userReserved.hashCode() : 0);
        return result;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    public boolean isHasAdditionalService() {
        return hasAdditionalService;
    }

    public void setHasAdditionalService(boolean hasAdditionalService) {
        this.hasAdditionalService = hasAdditionalService;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public User getUserReserved() {
        return userReserved;
    }

    public void setUserReserved(User userReserved) {
        this.userReserved = userReserved;
    }
}
