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
    */
    public void addStation(Station station) {

        if (stations == null) {
            stations = new ArrayList();
            stations.add(station);
        }

    }
}
