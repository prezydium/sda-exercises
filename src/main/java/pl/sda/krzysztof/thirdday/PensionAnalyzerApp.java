package pl.sda.krzysztof.thirdday;

import pl.sda.krzysztof.thirdday.example.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PensionAnalyzerApp {

    public static void main(String[] args) {

        List<Employee> allEmployees = dataProvider();

        List<Employee> potentialPeopleToFire = new ArrayList<>();

        for (Employee singleEmployee : allEmployees) {
            if (singleEmployee.getSalary() < 10000) {
                potentialPeopleToFire.add(singleEmployee);
            }
        }
        System.out.println(potentialPeopleToFire);

        Employee employeeToFire = getUnluckyEmployee(potentialPeopleToFire);
        System.out.println("Person to seek new opportunities " +
                "outside our company is:" + employeeToFire);
    }

    private static Employee getUnluckyEmployee(List<Employee> listOfEmployee) {
        int indexOfPersonToFire = new Random().nextInt(listOfEmployee.size());
        return listOfEmployee.get(indexOfPersonToFire);
    }

    private static List<Employee> dataProvider() {
        Employee kristoff = new Employee("Kristof", "123", 15000);
        Employee kasia = new Employee("Kasia", "324", 25000);
        Employee grazynka = new Employee("Grażynka", "456", 3500);
        Employee karol = new Employee("Karol", "433", 13000);
        Employee zbigniew = new Employee("Zbigniew", "555", 13000);
        Employee joanna = new Employee("Joanna", "322", 1500);
        Employee aziz = new Employee("Aziz", "333", 4999);
        List<Employee> employees = new ArrayList<>();
        employees.add(kristoff);
        employees.add(kasia);
        employees.add(grazynka);
        employees.add(karol);
        employees.add(zbigniew);
        employees.add(joanna);
        employees.add(aziz);
        return employees;
    }
}
