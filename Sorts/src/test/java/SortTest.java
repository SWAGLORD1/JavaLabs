import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import junit.framework.Assert.*;

public class SortTest {

    private Integer[] generateRandomArray() {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(size/5);
        }
        return array;
    }

    private boolean isSorted(Integer[] array) {
        boolean correct = true;
        for (int i = 0; i < array.length - 1; i++)
            if (array[i].compareTo(array[i + 1]) > 0)
                correct = false;
        return correct;
    }

    private boolean checkElements(Integer[] array, Integer[] example) {
        boolean correct;
        for (int i = 0; i < array.length; i++) {
            correct = false;
            for (int j = i; j < array.length; j++)
                if (example[i].equals(array[j])) {
                    correct = true;
                    Integer tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            if(!correct)
                return false;
        }
        return true;
    }

    public void testElements(Sort sort) {
        Integer[] array = generateRandomArray();
        Integer[] example = array.clone();
        sort.sort(array, Integer::compareTo);
        Assert.assertTrue(checkElements(array, example));
    }

    public void testIsSorted(Sort sort) {
        Integer[] array = generateRandomArray();
        sort.sort(array, Integer::compareTo);
        Assert.assertTrue(isSorted(array));
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
        Assert.assertTrue(isSorted(array));
    }

    public void testReverse(Sort sort) {
        Random rnd = new Random(System.currentTimeMillis());
        int size = rnd.nextInt(1000);
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }
        sort.sort(array, Integer::compareTo);
        Assert.assertTrue(isSorted(array));
    }

}
