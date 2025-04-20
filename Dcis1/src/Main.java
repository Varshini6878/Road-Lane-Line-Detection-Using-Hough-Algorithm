
class Employee {
    private String name;
    private String department;
    private String employer;
    private int desktopsAssigned;
    private int chairsAssigned;

    public Employee(String name, String department, String employer, int desktopsAssigned, int chairsAssigned) {
        this.name = name;
        this.department = department;
        this.employer = employer;
        this.desktopsAssigned = desktopsAssigned;
        this.chairsAssigned = chairsAssigned;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name");
        System.out.println("Department");
        System.out.println("Employer");

    }
}
class Resources {
    private int desktopsAssigned;
    private int chairsAssigned;
}
public Resources( int desktopsAssigned, int chairsAssigned) {
    this.desktopsAssigned = desktopsAssigned;
    this.chairsAssigned = chairsAssigned;

    public void displayResourceDetails()  {
        System.out.println("Desktops Assigned");
        System.out.println("Chairs Assigned");
}