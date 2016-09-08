import java.util.*;

class Test
{

    public static void main(String[] args)
    {
        Thing[] array = new Thing[5];
        for (int i=0;i<5;i++)
            array[i] = new Thing();
        array[0].num = 5;
        array[1].num = 1;
        array[2].num = 4;
        array[3].num = 2;
        array[4].num = 3;
        Sorter.heapSort(array);
        for (int i=0;i<5;i++)
        {
            System.out.print(array[i].num);
            System.out.print(" ");
        }
    }

}

class Thing implements Comparable
{

    int num;

    Thing()
    {
        num = 0;
    }

    public int compareTo(Object obj)
    {
        Thing tmp = (Thing)obj;
        if(this.num < tmp.num)
        {
            return -1;
        }
        else if(this.num > tmp.num)
        {
            return 1;
        }
        return 0;
    }

}

class Sorter
{

    public static <T extends Comparable<T>> void insertionSort(T[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            T key = array[i];
            int j = i - 1;

            while(j >= 0 && key.compareTo(array[j]) < 0)
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    private static<T extends Comparable<T>> void heapify(T[] array, int i, int j)
    {
        int MaxNodeId;
        boolean ShiftDone = false;
        while (((i * 2 + 1) < j) && !ShiftDone)
        {
            if (i * 2 + 1 == j - 1 || array[i * 2 + 1].compareTo(array[i * 2 + 2]) > 0)
            {
                MaxNodeId = i * 2 + 1;
            }
            else
            {
                MaxNodeId = i * 2 + 2;
            }

            if (array[i].compareTo(array[MaxNodeId]) < 0)
            {
                T tmp = array[i];
                array[i] = array[MaxNodeId];
                array[MaxNodeId] = tmp;
                i = MaxNodeId;
            }
            else
            {
                ShiftDone = true;
            }
        }
    }

    public static<T extends Comparable<T>> void heapSort(T[] array)
    {
        for (int i = array.length / 2 - 1; i >= 0; i--)
        {
            heapify(array, i, array.length);
        }
        for(int i = array.length - 1; i >= 0; i--)
        {
            T tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            heapify(array,0,i);
        }
    }

}