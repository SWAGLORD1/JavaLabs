import org.junit.Test;

public class InsertionSortTest extends SortTest{

    @Test
    public void insertionTestElements() {
        testElements(InsertionSort::sort);
    }

}
