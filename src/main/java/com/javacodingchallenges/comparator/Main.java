package com.javacodingchallenges.comparator;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Emp", "123 main", 12.2);
        Employee e2 = new Employee(2, "Emp", "123 main", 12.2);
        Employee e3 = new Employee(3, "Emp", "123 main", 12.2);
        Employee e4 = new Employee(4, "Emp", "123 main", 12.2);
        Employee e5 = new Employee(5, "Emp", "123 main", 12.2);


        EmployeeComparator employeeComparator = new EmployeeComparator();
        System.out.println(employeeComparator.compare(e1, e3));;

    }



}
