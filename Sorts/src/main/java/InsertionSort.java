import java.util.Comparator;

public class InsertionSort implements Sort {

    @Override
    public <T> void sort(T[] array, Comparator<T> comparator) {
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;

            while (j >= 0 && comparator.compare(key, array[j]) < 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

}
