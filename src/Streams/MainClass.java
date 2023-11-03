package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {

    public  static void main(String args[]){
        //using Comparable
        Employee e1 = new Employee( "Ashish", 1, "IT");
        Employee e2 = new Employee( "Mahesh", 3, "IT");
        Employee e3 = new Employee( "Ambrish", 6, "CS");
        Employee e4 = new Employee( "Sumit", 2,"CS");
        Employee e5 = new Employee( "AC", 6,"CS");

        List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5);

        employeeList.stream().forEach(System.out::println);

        //operations

        //filter functionality
        System.out.println("filtering id < 4 and name ashish");
        List<Employee> employeeList1 = employeeList.stream().filter(e -> e.getName() == "Ashish" && e.getEmployeeId()<5).collect(Collectors.toList());
        employeeList1.stream().forEach(System.out::println);

        //grouping by IT department
        Map<String, List<Employee>> employeeMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employeeMap);
        long count = employeeMap.get("IT").stream().count();
        System.out.println(count);

        //getting all employee IDs only
        System.out.println("getting all employee IDs only");
        employeeList.stream().mapToInt(e-> e.getEmployeeId()).forEach(System.out::println);

        //getting all employee IDs only with map
        System.out.println("getting all employee IDs only");
        employeeList.stream().map(e-> e.getEmployeeId()).forEach(System.out::println);
    }
}
