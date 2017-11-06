/**
 * Абстрактный строитель.
 * @param <T> реализация строителя.
 * @param <E> реализация продукта.
 * @param <L> локальное местоположение продукта.
 *
 * @author Timur Kashapov
 * @version 0.0.1
 * @since 2017
 */
public abstract class AbstractBuilder<T, E, L> {

    /**
     * Местоположение.
     * @param location местоположение.
     */
    public abstract T location(L location);

    /**
     * Название.
     * @param title название.
     */
    public abstract T title(String title);

    /**
     * Создать объект.
     * @return объект.
     */
    public abstract E build();
}
