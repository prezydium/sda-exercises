package pl.sda.krzysztof.fourthday;

import java.util.Arrays;

public class App {

    public static void main(String[] args) throws InterruptedException {
        TimeCalculator calculator = new TimeCalculator();
//        calculator.daysToChristmasEveInfo();
//
//        calculator.daysToChristmasEve(LocalDate.of(2020, 7, 24));
//        calculator.daysToChristmasEve(LocalDate.of(2020, 12, 23));
//        calculator.daysToChristmasEve(LocalDate.of(2021, 2, 14));
//        calculator.daysToChristmasEve(LocalDate.of(2023, 12, 28));
        //       calculator.minutesLeftToTheEndOfClass();

//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);

        MyQueue<String> myStringQueue = new MyQueue<>();
        myStringQueue.offer("Hello");
        myStringQueue.offer("is it me");
        myStringQueue.offer("you are looking for?");
        myStringQueue.offer("NO!");
        myStringQueue.printAll();
        myStringQueue.pool();
        System.out.println("second pool: " + myStringQueue.pool());
        System.out.println("After removal: ");
        myStringQueue.printAll();

    }


    private static void bubbleSortTest() {
        int[] numbers = {10, -4, 66, 3223, 34, 0, -434, 5, 5, 78};
        BubbleSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
