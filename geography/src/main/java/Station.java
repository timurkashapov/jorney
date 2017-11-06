import location.Address;
import location.Coordinate;

/**
 * Станция.
 *
 * @author Timur Kashapov
 * @version 0.0.1
 * @since 2017
 */
public class Station {

    /**
     * Экземпляр станция.
     */
    private Station station;

    /**
     * Населенный пункт станции.
     */
    private Locality location;

    /**
     * Адрес станции.
     */
    private Address address;

    /**
     * Название станции.
     */
    private String title;

    /**
     * Тип станции.
     */
    private enum STATION_TYPE {AUTO, AERO, TRAIN}

    /**
     * Телефоны справочной службы.
     */
    private String phone;

    /**
     * Конструктор.
     */
    public Station() {
        // TODO: 1. скорректировать создание экземпляра станции через строитель.
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
         this.station = station;
     }

    public Locality getLocation() {
        return location;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setLocation(Locality location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Station getByTitle(final String title) {
        // TODO: 2. реализовать получение станции по её названию.
        return new Station();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Station station = (Station) o;

        if (address != null ? !address.equals(station.address) : station.address != null) return false;
        if (location != null ? !location.equals(station.location) : station.location != null) return false;
        return phone != null ? phone.equals(station.phone) : station.phone == null;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
