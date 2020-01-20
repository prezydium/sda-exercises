package pl.sda.krzysztof.thirdday.example;

import java.util.*;

public class CollectionExamples {

    public static void main(String[] args) {
        arrayListExample();
        setExample();
        mapExample();

    }

    private static void arrayListExample() {
        Employee kristoff = new Employee("Kristof", "123", 15000);
        Employee kasia = new Employee("Kasia", "324", 25000);
        Employee grazynka = new Employee("Grażynka", "456", 3500);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(kristoff);
        employeeList.add(kasia);
        employeeList.add(grazynka);

        for (Employee singleEmployee : employeeList) {
            singleEmployee.giveRaise(1000);
        }

        for (Employee singleEmployee : employeeList) {
            System.out.println(singleEmployee);
        }
    }

    private static void setExample() {
        Set<Employee> setOfEmployees = new HashSet<>();
        Employee kristoff = new Employee("Kristof", "123", 15000);
        Employee kristoff2 = new Employee("Kristof", "123", 15000);
        setOfEmployees.add(kristoff);
        setOfEmployees.add(kristoff);
        setOfEmployees.add(kristoff2);

        for (Employee singleEmployee : setOfEmployees) {
            System.out.println(singleEmployee);
        }
    }

    private static void mapExample() {
        Map<String, Employee> mapOfEmployees = new HashMap<>();
        Employee kristoff = new Employee("Kristof", "123", 15000);
        Employee kasia = new Employee("Kasia", "324", 25000);
        Employee grazynka = new Employee("Grażynka", "456", 3500);
        mapOfEmployees.put("70g", kristoff);
        mapOfEmployees.put("20s", kasia);
        mapOfEmployees.put("54x", grazynka);

        Employee employee = mapOfEmployees.get("20s");
        System.out.println(employee);

    }

}

