package Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        //return o1.getName().compareTo(o2.getName())<0 ? -1 : o2.getName().compareTo(o1.getName())>0 ? 1 : 0 ;
        return o1.getName().compareTo(o2.getName());
    }
}
