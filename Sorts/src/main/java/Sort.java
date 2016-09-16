import java.util.*;

@FunctionalInterface
interface Sort {

    <T> void sort(T[] array, Comparator<T> comparator);

    default  <T extends Comparable<T>> void sort(T[] array) {
        sort(array,
                (a,b) -> a.compareTo(b));
    }

}