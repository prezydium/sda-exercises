package pl.sda.krzysztof.secondday.agevalidator;

import pl.sda.krzysztof.secondday.Person;

import java.time.LocalDate;

public class AgeValidatorApp {

    public static void main(String[] args) {
        Person person =
                new Person("Jan",
                        "Janowski",
                        "89021476971",
                        LocalDate.of(1989, 2, 14));
        Person underagePerson =
                new Person("Brajan",
                        "Janowski",
                        "10221489793",
                        LocalDate.of(2010, 2, 14));

        Person invalidBirthDatePerson =
                new Person("NotBrajan",
                        "Janowski",
                        "10221489793",
                        LocalDate.of(1990, 2, 14));


        System.out.println(AgeValidator.isAdult(person));
        System.out.println(AgeValidator.isAdult(underagePerson));
        System.out.println(AgeValidator.isAdult(invalidBirthDatePerson));
    }
}
