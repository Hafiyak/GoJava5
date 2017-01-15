package Module05;

/**
 * Created by user on 13.01.2017.
 */

import java.util.GregorianCalendar;
import java.util.Objects;

public class Room {
    private long id;
    private int price;
    private int persons;
    private GregorianCalendar dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int persons, int fromYear, int fromMonth, int fromDate, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = new GregorianCalendar(fromYear, fromMonth, fromDate);
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (getId() != room.getId()) return false;
        if (getPrice() != room.getPrice()) return false;
        if (getPersons() != room.getPersons()) return false;
        if (getDateAvailableFrom() != null ? !getDateAvailableFrom().equals(room.getDateAvailableFrom()) : room.getDateAvailableFrom() != null)
            return false;
        if (getHotelName() != null ? !getHotelName().equals(room.getHotelName()) : room.getHotelName() != null)
            return false;
        return getCityName() != null ? getCityName().equals(room.getCityName()) : room.getCityName() == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getPrice();
        result = 31 * result + getPersons();
        result = 31 * result + (getDateAvailableFrom() != null ? getDateAvailableFrom().hashCode() : 0);
        result = 31 * result + (getHotelName() != null ? getHotelName().hashCode() : 0);
        result = 31 * result + (getCityName() != null ? getCityName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Room{ " +
                this.id + " " +
                this.price + " " +
                this.persons + " " +
                this.hotelName + " " +
                this.cityName + " " +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public void setDateAvailableFrom(GregorianCalendar dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getPersons() {
        return persons;
    }

    public GregorianCalendar getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCityName() {
        return cityName;
    }
}