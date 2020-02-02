package pl.sda.krzysztof.fifthday;

import java.util.Arrays;

public class AppFifth {

    public static void main(String[] args) {
        int[] arrOne = {12, 5, 3, 5, 6, 3, 353, 42};
        int[] arrTwo = {12, -5, 3, 5, 2332, 13, 353, 0, 42, 55, 6666, 34};
        System.out.println("arrOne");
        System.out.println(Arrays.toString(arrOne));
        QuickSort.sort(arrOne);
        System.out.println(Arrays.toString(arrOne));

        System.out.println("arrTwo");
        System.out.println(Arrays.toString(arrTwo));
        QuickSort.sort(arrTwo);
        System.out.println(Arrays.toString(arrTwo));

    }
}
