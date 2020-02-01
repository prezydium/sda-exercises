package pl.sda.krzysztof.fourthday;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeCalculator {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(daysToChristmas());
        minutesLeftToTheEndOfClass();
    }

    public static long daysToChristmas() {
        LocalDate now = LocalDate.now();
        int yearOfChristmas = now.getYear();
        if (now.getMonthValue() == 12 && now.getDayOfMonth() > 24) {
            yearOfChristmas = now.plusYears(1).getYear();
        }
        LocalDate christmasEveDate = LocalDate.of(yearOfChristmas, 12, 24);
        return ChronoUnit.DAYS.between(now, christmasEveDate);
    }

    public static void minutesLeftToTheEndOfClass() throws InterruptedException {

        long between;
        do {
           LocalTime now = LocalTime.now();
            between = ChronoUnit.MINUTES.between(now, LocalTime.of(16, 0));
            System.out.println(between);
            Thread.sleep(5000);
        } while (between > 0);

    }
}
