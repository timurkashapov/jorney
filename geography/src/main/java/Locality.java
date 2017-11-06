import java.util.Collection;
import java.util.HashSet;
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
    private String title;

    /**
     * Название района.
     */
    private String district;

    /**
     * Название области.
     */
    private String region;

    /**
     * Станции.
     */
    private Set<Station> stations;

    /**
     * 
     */
    public Locality() {
        stations = new HashSet<>();
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
        // TODO реализовать поиск и удаление станции по названию.
    }

    public void getStation(final String title) {
        // TODO: реализовать возврат экземпляра станции по названию.
    }

    public boolean contains(Station station) {

        boolean result = false;

        for(Station item: stations) {
            result = item.equals(station);
        }
        return result;
    }

    /**
     * Получение списка станций населённого пункта.
     * @return список станций.
     */
    public Set<Station> getStations() {

//        return Collections.emptySet();
        return stations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Locality locality = (Locality) o;

        if (!title.equals(locality.title)) return false;
        if (!district.equals(locality.district)) return false;
        if (!region.equals(locality.region)) return false;
        return stations.equals(locality.stations);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + district.hashCode();
        result = 31 * result + region.hashCode();
        result = 31 * result + stations.hashCode();
        return result;
    }
}
    