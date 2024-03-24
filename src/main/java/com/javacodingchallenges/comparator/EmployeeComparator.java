package com.javacodingchallenges.comparator;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{


    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getId() < e2.getId()) {
            return 1;
        } else if (e1.getSalary() < e2.getSalary()) {
            return 1;
        } else if (e1.getName().compareTo(e2.getName()) < 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
