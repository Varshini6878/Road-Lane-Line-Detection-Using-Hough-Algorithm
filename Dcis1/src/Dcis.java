public class Dcis {

    public static void main(String[] args) {
        // Create 5 employee objects with individual resource data
        Employee emp1 = new Employee("Alice", "Engineering", "DCIS", 5, 5);
        Employee emp2 = new Employee("Bob", "QA", "DCIS", 4, 6);
        Employee emp3 = new Employee("Charlie", "Engineering", "DCIS", 6, 4);
        Employee emp4 = new Employee("David", "QA", "DCIS", 5, 5);
        Employee emp5 = new Employee("Eva", "Engineering", "DCIS", 7, 3);

        // Display details for each employee
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
        emp4.displayEmployeeDetails();
        emp5.displayEmployeeDetails();

        }
}
