package Gama.T1;

import java.util.function.Function;

public interface ThrowingFunction<T, R, E extends Throwable> {
    R apply(T result) throws E;

    static <T, R, E extends Throwable> Function<T, R> uncjeck(ThrowingFunction<R, T, E> temp) {
        return result -> {
            try {

                return (R) temp.apply((R) result);
            } catch (Throwable exp) {
                throw new RuntimeException(exp);
            }
        };
    }
}
