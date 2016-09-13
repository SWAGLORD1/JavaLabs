import java.util.*;

@FunctionalInterface
interface Sort {
    <T> void sort(T[] array, Comparator<T> comparator);
}