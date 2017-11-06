import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocalityTest {

    private static Locality location;
    private static Station station;

    @Before
    public void init() {
        location = new Locality();
        station  = new Station();
        location.setTitle("Shosse Entuziastov");
        location.setDistrict("Sokolinaya Gora");
        location.setRegion("Moscow");
    }

    @Test
    public void addValidStation() throws Exception {

        location.addStation(station);

        // TODO: реализовать тестирование проверки добавления станци в коллекцию населенного пукта.
//        assertTrue(location.contains(station));
//        assertEquals(location, station.getLocation());
    }

    @Test
    public void delStation() throws Exception {

        // TODO реализовать тестирование удаления станции.
//        location.delStation(station.getTitle());
//        assertFalse(location.contains(station));
    }

    @Test
    public void getStations() throws Exception {
        // TODO: реализовать тестирование возврата коллекции станций.
    }

    @Test
    public boolean containsStation(Locality location, Station station) {
        return location.getStations().contains(station);
    }
}