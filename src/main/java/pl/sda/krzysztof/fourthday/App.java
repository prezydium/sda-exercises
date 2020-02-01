package pl.sda.krzysztof.fourthday;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] arr1 = {4343, 4, 343, 4, 543, 55, 33, 222, 4, 56, 64, 464, 2, 56};
        QuickSort.quicksort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {53, 3, 55, 2, 1 , 55, 0 ,-10, 4, -39393, 333, 23232, 3, 342, 23, 3, 543, 5, 6, 5232, 3, 3525, -12};
        QuickSort.quicksort(arr2);
        System.out.println(Arrays.toString(arr2));

        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.offer("hello");
        myQueue.offer("is it");
        myQueue.offer("me");
        myQueue.offer("you are");
        myQueue.offer("looking for?");

        System.out.println(myQueue.pool());
        System.out.println(myQueue.pool());
        System.out.println(myQueue.pool());
        System.out.println("REMAINING x 2:");
        myQueue.printAll();
        myQueue.printAll();
    }
}
