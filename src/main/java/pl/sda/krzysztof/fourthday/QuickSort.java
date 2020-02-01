package pl.sda.krzysztof.fourthday;

public class QuickSort {


    public static void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }


    private static void quicksort(int[] arr, int lowerIndex, int higherIndex) {
        int pivot = arr[(lowerIndex + higherIndex) / 2];
        int leftSearch = lowerIndex;
        int rightSearch = higherIndex;
        while (leftSearch <= rightSearch) {
            while (arr[leftSearch] < pivot) {
                leftSearch++;
            }
            while (arr[rightSearch] > pivot) {
                rightSearch--;
            }
            if (leftSearch <= rightSearch){
                swap(arr, leftSearch, rightSearch);
                leftSearch++;
                rightSearch--;
            }
        }
        if (lowerIndex < rightSearch){
            quicksort(arr, lowerIndex, rightSearch);
        }
        if (leftSearch < higherIndex){
            quicksort(arr, leftSearch, higherIndex);
        }
    }


    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
