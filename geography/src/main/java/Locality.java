import java.util.Set;

/**
 * Населенный пункт.
 *
 * @author Timur Kashapov
 * @version 0.0.1
 * @since 2017
*/
public class Locality {

    /**
     * Название населенного пункта.
     */
    private String localityTitle;

    /**
     * Название района.
     */
    private String districtTitle;

    /**
     * Название области.
     */
    private String regionTitle;

    /**
     * Станции.
     */
    private Set<Station> stations;

    /**
     * 
     */
    public Locality() {

    }

    /**
    * Добавление станции.
    * @param station станция.
    */
    public void addStation(final Station station) {
        stations.add(station);
    }

    /**
    * Удаление станции.
    * @param title название станции.
    */
    public void delStation(final String title) {
        // Поиск и удаление станции по названию.
    }

    /**
     * Получение списка станций населённого пункта.
     * @return список станций.
     */
    public Set<Station> getStations() {
        return stations;
    }
}
    