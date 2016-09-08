import org.junit.Assert;
import org.junit.Test;
import java.util.Random;
import junit.framework.Assert.*;

public class SorterTest
{

    @Test
    public void testInsertionElements()
    {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Thing[] array = new Thing[size];
        Thing[] example = new Thing[size];
        for(int i=0;i<size;i++)
        {
            array[i] = new Thing();
            array[i].num = rnd.nextInt(1000);
            example[i] = new Thing();
            example[i].num = array[i].num;
        }
        Sorter.insertionSort(array);
        boolean correct;
        for(int i=0;i<size;i++)
        {
            correct = false;
            for (int j = i; j < size; j++)
                if (example[i].num == array[j].num)
                {
                    correct = true;
                    Thing tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            Assert.assertTrue(correct);
        }
    }

    @Test
    public void testHeapElements()
    {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Thing[] array = new Thing[size];
        Thing[] example = new Thing[size];
        for(int i=0;i<size;i++)
        {
            array[i] = new Thing();
            array[i].num = rnd.nextInt(1000);
            example[i] = new Thing();
            example[i].num = array[i].num;
        }
        Sorter.heapSort(array);
        boolean correct;
        for(int i=0;i<size;i++)
        {
            correct = false;
            for (int j = i; j < size; j++)
                if (example[i].num == array[j].num)
                {
                    correct = true;
                    Thing tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            Assert.assertTrue(correct);
        }
    }

    @Test
    public void testInsertionIsSorted()
    {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Thing[] array = new Thing[size];
        for(int i=0;i<size;i++)
        {
            array[i] = new Thing();
            array[i].num = rnd.nextInt(1000);
        }
        Sorter.insertionSort(array);
        for(int i=0;i<size-1;i++)
            Assert.assertTrue(array[i].compareTo(array[i+1]) <= 0);
    }

    @Test
    public void testHeapIsSorted()
    {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Thing[] array = new Thing[size];
        for(int i=0;i<size;i++)
        {
            array[i] = new Thing();
            array[i].num = rnd.nextInt(1000);
        }
        Sorter.heapSort(array);
        for(int i=0;i<size-1;i++)
            Assert.assertTrue(array[i].compareTo(array[i+1]) <= 0);
    }

    @Test
    public void testInsertionEmpty()
    {
        Thing[] array = new Thing[0];
        Sorter.insertionSort(array);
    }

    @Test
    public void testHeapEmpty()
    {
        Thing[] array = new Thing[0];
        Sorter.heapSort(array);
    }

    @Test
    public void testInsertionSorted()
    {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Thing[] array = new Thing[size];
        Thing[] example = new Thing[size];
        for(int i=0;i<size;i++)
        {
            array[i] = new Thing();
            array[i].num = i;
            example[i] = new Thing();
            example[i].num = i;
        }
        Sorter.insertionSort(array);
        for(int i=0;i<size-1;i++)
            Assert.assertTrue(example[i].compareTo(array[i]) == 0);
    }

    @Test
    public void testHeapSorted()
    {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Thing[] array = new Thing[size];
        Thing[] example = new Thing[size];
        for(int i=0;i<size;i++)
        {
            array[i] = new Thing();
            array[i].num = i;
            example[i] = new Thing();
            example[i].num = i;
        }
        Sorter.heapSort(array);
        for(int i=0;i<size-1;i++)
            Assert.assertTrue(example[i].compareTo(array[i]) == 0);
    }

    @Test
    public void testInsertionReverse()
    {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Thing[] array = new Thing[size];
        for(int i=0;i<size;i++)
        {
            array[i] = new Thing();
            array[i].num = size - i;
        }
        Sorter.insertionSort(array);
        for(int i=0;i<size-1;i++)
            Assert.assertTrue(array[i].compareTo(array[i+1]) <= 0);
    }

    @Test
    public void testHeapReverse()
    {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Thing[] array = new Thing[size];
        for(int i=0;i<size;i++)
        {
            array[i] = new Thing();
            array[i].num = size - i;
        }
        Sorter.insertionSort(array);
        for(int i=0;i<size-1;i++)
            Assert.assertTrue(array[i].compareTo(array[i+1]) <= 0);
    }

}
