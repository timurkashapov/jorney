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
     * Адрес станции.
     */
    private String address;

    /**
     * Координаты станции.
     */
    private Coordinate coordinates;

    /**
     * Тип станции.
     */
    private enum STATION_TYPE {AUTO, AERO, TRAIN}

    /**
     * Населенный пункт станции.
     */
    private Locality location;

    /**
     * Телефоны справочной службы.
     */
    private String phone;

    /**
     * Конструктор.
     */
    private Station() {
        // TODO:
    }

    /**
     * Строитель станций.
     *
     * @author Timur Kashapov
     * @version 0.0.1
     * @since 2017
     */
    public static final class Builder {


        public static Station build() {
            return new Station();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Station station = (Station) o;

        if (address != null ? !address.equals(station.address) : station.address != null) return false;
        if (coordinates != null ? !coordinates.equals(station.coordinates) : station.coordinates != null) return false;
        if (location != null ? !location.equals(station.location) : station.location != null) return false;
        return phone != null ? phone.equals(station.phone) : station.phone == null;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (coordinates != null ? coordinates.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
