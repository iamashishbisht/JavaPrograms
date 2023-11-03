package Streams;

public class Employee implements Comparable<Employee> {

    String name;
    int employeeId;
    String department;

    Employee(String name, int employeeId, String department){
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public int compareTo(Employee o) {
        return this.employeeId - o.employeeId;
    }

    public  String getName(){
        return  this.name;
    }

    public int getEmployeeId(){
        return  this.employeeId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void getEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public  String getDepartment(){
        return  this.department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    @Override
    public  String toString(){
        return "id -> "+ this.employeeId + " name -> "+ this.name + " department -> "+ this.department;
    }
}
