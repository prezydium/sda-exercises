package pl.sda.krzysztof.secondday;


import java.time.LocalDate;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private String peselNumber;
    private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, String peselNumber, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselNumber = peselNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public int compareTo(Person otherPerson) {
        if (otherPerson == null || otherPerson.dateOfBirth == null) {
            return Integer.MIN_VALUE;
        }
        return this.dateOfBirth.compareTo(otherPerson.dateOfBirth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", peselNumber='" + peselNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
