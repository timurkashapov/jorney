package location;

/**
 * Адрес объекта.
 *
 * @author Timur Kashapov
 * @version 0.0.1
 * @since 2017
 */
public class Address {

    /**
     * Координаты станции.
     */
    private Coordinate coordinates;

    /**
     * Почтовый индекс.
     */
    private Integer zipc;

    /**
     * Название улицы.
     */
    private String street;

    /**
     * Номер дома.
     */
    private Integer house;

    /**
     * Номер квартиры.
     */
    private Integer apartment;

    public Coordinate getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate coordinates) {
        this.coordinates = coordinates;
    }

    public Integer getZipc() {
        return zipc;
    }

    public void setZipc(Integer zipc) {
        this.zipc = zipc;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public Integer getApartment() {
        return apartment;
    }

    public void setApartment(Integer apartment) {
        this.apartment = apartment;
    }
}
