package pl.sda.krzysztof.fourthday;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimeCalculator {

    public void daysToChristmasEveInfo(){
        LocalDate today = LocalDate.now();
        daysToChristmasEve(today);
    }

    public void daysToChristmasEve(LocalDate today){
        LocalDate closestChristmas = LocalDate.of(today.getYear(), 12, 24);
        if (today.getMonthValue() == 12 && today.getDayOfMonth() > 24){
            closestChristmas = closestChristmas.plusYears(1);
        }

        long result = ChronoUnit.DAYS.between(today, closestChristmas);
        String info = "It's just " + result + " to Christmas Eve!";
        System.out.println(info);
        if (result < 60){
            System.out.println("Time to buy gifts");
        }
    }
}
