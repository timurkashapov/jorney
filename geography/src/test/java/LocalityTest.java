import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocalityTest {

    private static Locality location = new Locality();
    private static Station station   = new Station();

    @Before
    public void init() {

        location.setTitle("Shosse Entuziastov");
        location.setDistrict("Sokolinaya Gora");
        location.setRegion("Moscow");
        station.setLocation(location);
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

}