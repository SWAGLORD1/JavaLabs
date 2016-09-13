import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import junit.framework.Assert.*;

public class SortTest {

    public void testElements(Sort sort) {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Integer[] array = new Integer[size];
        Integer[] example = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(1000);
            example[i] = array[i];
        }
        sort.sort(array, Integer::compareTo);
        boolean correct;
        for (int i = 0; i < size; i++) {
            correct = false;
            for (int j = i; j < size; j++)
                if (example[i] == array[j]) {
                    correct = true;
                    Integer tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            Assert.assertTrue(correct);
        }
    }

    public void testIsSorted(Sort sort) {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(1000);
        }
        sort.sort(array, Integer::compareTo);
        for (int i = 0; i < size - 1; i++)
            Assert.assertTrue(array[i].compareTo(array[i + 1]) <= 0);
    }

    public void testEmpty(Sort sort) {
        Integer[] array = new Integer[0];
        sort.sort(array, Integer::compareTo);
    }

    public void testSorted(Sort sort) {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Integer[] array = new Integer[size];
        Integer[] example = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
            example[i] = i;
        }
        sort.sort(array, Integer::compareTo);
        for (int i = 0; i < size - 1; i++)
            Assert.assertTrue(example[i].compareTo(array[i]) == 0);
    }

    public void testReverse(Sort sort) {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }
        sort.sort(array, Integer::compareTo);
        for (int i = 0; i < size - 1; i++)
            Assert.assertTrue(array[i].compareTo(array[i + 1]) <= 0);
    }

}
