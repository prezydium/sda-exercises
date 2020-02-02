package pl.sda.krzysztof.fifthday;

import pl.sda.krzysztof.secondday.Person;

import java.time.LocalDate;
import java.util.Arrays;

public class AppFifth {

    public static void main(String[] args) {
        int[] testArr = {2, 5, 6, 42, 48, 422, 4424, 5000, 5003, 5043, 437434};
        int result = BinarySearch.search(5043, testArr, 0, testArr.length - 1);
        System.out.println("Element found on index: " + result);
    }

    private static void linearSearchExercise() {
        SoftDrink[] arrDrinks = {
                new SoftDrink("Coca Cola", "Coca Cola Inc", 4.5),
                new SoftDrink("Pepsi", "PepsiCo", 4.2),
                new SoftDrink("Mirinda", "PepsiCo", 3.5),
                new SoftDrink("Fanta", "Coca Cola Inc", 4.35),
                new SoftDrink("Cola Zero", "Coca Cola Inc", 4.35),
                new SoftDrink("Polo Cola", "PoloCocta", 2.35),
                new SoftDrink("Kompot teściowej", "Teściowa", Double.MAX_VALUE),
                new SoftDrink("3 cytryny", "Zbyszko", 0.0),
        };

        SoftDrink searchedSoftDrink = new SoftDrink("Fanta", "Coca Cola Inc", 4.35);

        int indexPosition = LinearSearchUtil.findFirstSoftDrink(searchedSoftDrink, arrDrinks);

        System.out.println("Searched drink is on: " + indexPosition);

    }

    private static void comparableTest() {

        Person personOne = new Person("John", "Smith", "123", LocalDate.of(1987, 12, 1));
        Person personTwo = new Person("Ann", "Smith", "324", LocalDate.of(2002, 6, 28));
        Person personThree = new Person("Zusa", "Args", "444", LocalDate.of(1985, 5, 11));
        Person personFourth = new Person("Caroline", "Koy", "432", LocalDate.of(1988, 1, 1));
        Person personFive = new Person("Abdullah", "Ali", "256", LocalDate.of(1958, 1, 12));
        Person personSix = new Person("Big", "O", "521", LocalDate.of(1984, 1, 15));
        Person personSeven = new Person("Gertruda", "Shmidt", "332", LocalDate.of(2000, 1, 1));
        Person personEight = new Person("TEST", "ACTOR", "312", null);

        Person[] people = {personOne, personTwo, personThree,
                personFourth, personFive, personSix, personSeven, personEight};

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));

    }

    private static void quickSortTest() {
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
