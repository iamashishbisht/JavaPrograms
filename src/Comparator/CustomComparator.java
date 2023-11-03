package Comparator;

import java.util.Comparator;

public class CustomComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.employeeId < o2.employeeId ? -1 : o2.employeeId < o1.employeeId ? 1 : 0 ;
    }
}
