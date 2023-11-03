package Shallow_Deep_Copy;

public class Main {
    public static void main(String[] args) {

        System.out.println("Example of shallow copy");
        ShallowClass shallowClass = new ShallowClass();
        Employee employee1 = new Employee("Ashish", 1);
        shallowClass.setEmployee(employee1);

        System.out.println("Name from object --> "+shallowClass.getEmployee());

        //changing employee object in main class only and it will reflect for shallow class object
        //because only reference got copied
        employee1.setName("Bisht");
        employee1.setEmployeeId(2);
        System.out.println("Name from shallow class object --> "+shallowClass.getEmployee());
    }
}
