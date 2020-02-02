package pl.sda.krzysztof.fifthday;

public class BinarySearch {

    public static int search(int searchedElement,
                             int[] arr,
                             int lowIndex,
                             int highIndex) {
        int middleIndex = (lowIndex + highIndex) / 2;
        int middleElement = arr[middleIndex];
        if (highIndex < lowIndex) {
            return -1;
        }
        if (searchedElement == middleElement) {
            return middleIndex;
        } else if (searchedElement < middleElement) {
            return search(searchedElement, arr, lowIndex, middleIndex - 1);
        } else {
            return search(searchedElement, arr, middleIndex + 1, highIndex);
        }
    }

}
