import org.junit.Test;

import static org.junit.Assert.*;

public class LocalityTest {

    @Test
    public void addStation() throws Exception {

        Station station = Station.Builder.build();

        Locality location = new Locality();

        location.addStation(station);
    }

    @Test
    public void delStation() throws Exception {
        System.out.println("OK");
    }

    @Test
    public void getStations() throws Exception {
        System.out.println("OK");
    }

}