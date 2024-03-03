/*
Program :   [Case 1]
Author  :   Reqi Jumantara Hapid
Date    :   03 Maret 2024
 */


package Week4.exercise3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[1] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[2] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[0] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        System.out.println("Before sorting:");
        for (Employee employee : staff) {
            employee.print();
        }

        System.out.println("\n======================");

        // Calling the compare method explicitly
        for (int i = 0; i < staff.length - 1; i++) {
            int comparisonResult = staff[i].compare(staff[i + 1]);
            System.out.println("Comparison Result: " + comparisonResult);
        }

        System.out.println("======================");

        Sortable.shell_sort(staff);

        System.out.println("\nAfter sorting:");
        for (Employee employee : staff) {
            employee.print();
        }
    }
}
