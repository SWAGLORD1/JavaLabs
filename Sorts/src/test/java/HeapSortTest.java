import org.junit.Test;

public class HeapSortTest extends SortTest{

    @Test
    public void heapTestElements() {
        testElements(new HeapSort());
    }

    @Test
    public void heapTestIsSorted() {
        testIsSorted(new HeapSort());
    }

    @Test
    public void heapTestEmpty() {
        testEmpty(new HeapSort());
    }

    @Test
    public void heapTestSorted() {
        testSorted(new HeapSort());
    }

    @Test
    public void heapTestReverse() {
        testReverse(new HeapSort());
    }

}
