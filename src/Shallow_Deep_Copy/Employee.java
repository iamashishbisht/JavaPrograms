package Shallow_Deep_Copy;

public class Employee{

    String name;
    int employeeId;

    Employee(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
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

    public void setEmployeeId(int id){
        this.employeeId = id;
    }

    public void getEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    @Override
    public  String toString(){
        return "id -> "+ this.employeeId + " name -> "+ this.name;
    }
}
