import java.util.ArrayList;
import java.util.List;

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
    private List<Station> stations;

    /**
     * 
     */
    public Locality() {

    }

    /**
    * Добавление станции.
    * @param station станция.
    */
    public void addStation(Station station) {
        stations.add(station);
    }

    /**
    * Удаление станции.
    * @param title название станции.
    */
    public void delStation(String title) {
        // Поиск и удаление станции по названию.
    }

    /**
     * Получение списка станций населённого пункта.
     * @return список станций.
     */
    public List<Station> getStations() {
        return stations;
    }
}
    