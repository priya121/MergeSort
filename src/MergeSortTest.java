import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {
    MergeSort newListToMerge = new MergeSort();

    @Test
    public void sortsOne() {
        List<Integer> listOfSortedNumbers = new ArrayList<>();
        List<Integer> listOfUnsortedNumbers = new ArrayList<>();
        listOfSortedNumbers.add(1);
        listOfUnsortedNumbers.add(1);
        assertEquals(listOfSortedNumbers, newListToMerge.merge((ArrayList<Integer>) listOfSortedNumbers));
    }

    @Test
    public void sortsTwo() {
        List<Integer> listOfSortedNumbers = new ArrayList<>();
        List<Integer> listOfUnsortedNumbers = new ArrayList<>();
        listOfUnsortedNumbers.add(2);
        listOfUnsortedNumbers.add(1);
        listOfSortedNumbers.add(1);
        listOfSortedNumbers.add(2);
        assertEquals(listOfSortedNumbers, newListToMerge.merge((ArrayList<Integer>) listOfUnsortedNumbers));
    }

    @Test
    public void sortsFourHalfSortedList() {
        List<Integer> listOfSortedNumbers = new ArrayList<>();
        List<Integer> listOfUnsortedNumbers = new ArrayList<>();
        listOfUnsortedNumbers.add(2);
        listOfUnsortedNumbers.add(1);
        listOfUnsortedNumbers.add(4);
        listOfUnsortedNumbers.add(3);
        listOfSortedNumbers.add(1);
        listOfSortedNumbers.add(2);
        listOfSortedNumbers.add(3);
        listOfSortedNumbers.add(4);
        assertEquals(listOfSortedNumbers, newListToMerge.merge((ArrayList<Integer>) listOfUnsortedNumbers));
    }

    @Test
    @Ignore
    public void sortsFourUnorderedList() {
        List<Integer> listOfSortedNumbers = new ArrayList<>();
        List<Integer> listOfUnsortedNumbers = new ArrayList<>();
        listOfUnsortedNumbers.add(2);
        listOfUnsortedNumbers.add(1);
        listOfUnsortedNumbers.add(4);
        listOfUnsortedNumbers.add(3);
        listOfSortedNumbers.add(1);
        listOfSortedNumbers.add(2);
        listOfSortedNumbers.add(3);
        listOfSortedNumbers.add(4);
        assertEquals(listOfSortedNumbers, newListToMerge.merge((ArrayList<Integer>) listOfUnsortedNumbers));
    }
}
