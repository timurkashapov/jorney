/**
 * Реализация строителя станций.
 *
 * @author Timur Kashapov
 * @version 0.0.1
 * @since 2017
 */
class StationBuilder extends AbstractBuilder<StationBuilder, Station, Locality> {

    @Override
    public StationBuilder location(Locality location) {
//        setLocation(location);
        return this;
    }

    @Override
    public StationBuilder title(String title) {
//        setTitle(title);
        return this;
    }

    @Override
    public Station build() {
        // TODO: 1. скорректировать создание экземпляра станции ...
        return new Station();
    }
}