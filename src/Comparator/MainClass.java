package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {

    public  static void main(String args[]){
    //using Comparable
        Employee e1 = new Employee( "Ashish", 1);
        Employee e2 = new Employee( "Mahesh", 3);
        Employee e3 = new Employee( "Ambrish", 6);
        Employee e4 = new Employee( "Sumit", 2);
        Employee e5 = new Employee( "AC", 6);

        List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5);

        //before sort
        System.out.println("before sorting");
        employeeList.stream().forEach(System.out::println);

        Collections.sort(employeeList, new CustomComparator());

        //after sort
        System.out.println("after sorting");
        employeeList.stream().forEach(System.out::println);

        // sorting by name
        System.out.println("after sorting by name");
        Collections.sort(employeeList, new NameComparator());
        employeeList.stream().forEach(System.out::println);

        // sorting by name in reverse
        System.out.println("after sorting by name");
        Collections.sort(employeeList, new NameComparator());
        Collections.reverse(employeeList);
        employeeList.stream().forEach(System.out::println);
    }
}
