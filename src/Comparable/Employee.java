package Comparable;

public class Employee implements Comparable<Employee> {

    String name;
    int employeeId;

    Employee(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public int compareTo(Employee o) {
        return this.employeeId - o.employeeId;
    }

    public  String getName(){
        return  this.name;
    }

    public int getEmployeeId(){
        return  this.getEmployeeId();
    }

    public void setName(String name){
        this.name = name;
    }

    public void getEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    @Override
    public  String toString(){
        return "id -> "+ this.employeeId + " name -> "+ this.name;
    }
}
