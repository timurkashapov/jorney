import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocalityTest {

    private static Station station = Station.Builder.build();
    private static Locality location = new Locality();

    @Test
    public void addStation() throws Exception {
        location.addStation(station);
    }

    @Test
    public void delStation() throws Exception {
//        location.delStation(station.getTitle());
    }

    @Test
    public void getStations() throws Exception {


        System.out.println("OK");
    }

}