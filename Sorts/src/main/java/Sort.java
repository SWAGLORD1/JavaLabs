import java.util.*;

interface Sort {
    <T> void sort(T[] array, Comparator<T> comparator);
}