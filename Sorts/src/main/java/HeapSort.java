import java.util.Comparator;

public class HeapSort implements Sort {

    private static <T> void heapify(T[] array, int i, int j, Comparator<T> comparator) {
        int MaxNodeId;
        boolean ShiftDone = false;
        while (((i * 2 + 1) < j) && !ShiftDone) {
            if (i * 2 + 1 == j - 1 || comparator.compare(array[i * 2 + 1], array[i * 2 + 2]) > 0) {
                MaxNodeId = i * 2 + 1;
            } else {
                MaxNodeId = i * 2 + 2;
            }

            if (comparator.compare(array[i], array[MaxNodeId]) < 0) {
                T tmp = array[i];
                array[i] = array[MaxNodeId];
                array[MaxNodeId] = tmp;
                i = MaxNodeId;
            } else {
                ShiftDone = true;
            }
        }
    }

    @Override
    public <T> void sort(T[] array, Comparator<T> comparator){
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, i, array.length, comparator);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            T tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            heapify(array, 0, i, comparator);
        }
    }

    public <T extends Comparable<T>> void sort(T[] array) {
        sort(array,
                (a,b) -> a.compareTo(b));
    }

}
