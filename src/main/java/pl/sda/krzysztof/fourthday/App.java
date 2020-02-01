package pl.sda.krzysztof.fourthday;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TimeCalculator calculator = new TimeCalculator();
        calculator.daysToChristmasEveInfo();

        calculator.daysToChristmasEve(LocalDate.of(2020, 7, 24));
        calculator.daysToChristmasEve(LocalDate.of(2020, 12, 23));
        calculator.daysToChristmasEve(LocalDate.of(2021, 2, 14));
        calculator.daysToChristmasEve(LocalDate.of(2023, 12, 28));
    }

}
