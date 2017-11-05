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


        public Station build() {
            return new Station();
        }
    }
}
