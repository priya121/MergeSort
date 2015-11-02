import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public List<Integer> merge(ArrayList<Integer> listOfNumbers) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        if (listOfNumbers.size() > 1) {
            int divided = listOfNumbers.size()/2;
            return divideList(listOfNumbers, divided);
        } else {
            return listOfNumbers;
        }
    }

    private List<Integer> divideList(ArrayList<Integer> listOfNumbers, int divided) {
        List<Integer> firstHalf = listOfNumbers.subList(0, divided);
        List<Integer> secondHalf = listOfNumbers.subList(divided, listOfNumbers.size());
        List<Integer> result = sortTwoNumbers(firstHalf,secondHalf);
        return result;
    }

    private List<Integer> sortTwoNumbers(List<Integer> firstHalf, List<Integer> secondHalf) {
        ArrayList<Integer> newList = new ArrayList<>();

        int firstNumberCheck = firstHalf.get(0);
        int secondNumberCheck = firstHalf.get(1);

        int thirdNumberCheck = secondHalf.get(0);
        int fourthNumberCheck= secondHalf.get(1);

        if (secondNumberCheck < firstNumberCheck)
            newList.add(0, secondNumberCheck);
        newList.add(1, firstNumberCheck);

        if (fourthNumberCheck < thirdNumberCheck)
            newList.add(2, fourthNumberCheck);
        newList.add(3, thirdNumberCheck);

        return newList;
    }

}
