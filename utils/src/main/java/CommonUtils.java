import edu.emory.mathcs.backport.java.util.Collections;

import java.util.Optional;
import java.util.Set;

/**
 * Общие утилиты для работы модулей и приложения в целом.
 */
public class CommonUtils {

    /**
     * Получение безопасного доступа к коллекции Set
     * @param src исходная коллескция
     * @param <T> коллекция
     * @return коллекция
     */
    public static <T> Set<T> getSafeSet(Set<T> src) {
        return Collections.unmodifiableSet(Optional.ofNullable(src).orElse(Collections.emptySet()));
    }
}
