import org.junit.Test;

public class InsertionSortTest extends SortTest {

    @Test
    public void insertionTestElements() {
        testElements(new InsertionSort());
    }

    @Test
    public void insertionTestIsSorted() {
        testIsSorted(new InsertionSort());
    }

    @Test
    public void insertionTestEmpty() {
        testEmpty(new InsertionSort());
    }

    @Test
    public void insertionTestSorted() {
        testSorted(new InsertionSort());
    }

    @Test
    public void insertionTestReverse() {
        testReverse(new InsertionSort());
    }

}
