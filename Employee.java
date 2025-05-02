import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    // Constructor to initialize employee attributes
    Employee(int eNo, String eName, double eSalary) {
        eNo = eNo;
        eName = eName;
        eSalary = eSalary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of employees
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Employee[] empArray = new Employee[n];

        // Input employee data
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee Number: ");
            int eNo = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter Employee Name: ");
            String eName = sc.nextLine();
            System.out.print("Enter Employee Salary: ");
            double eSalary = sc.nextDouble();
            empArray[i] = new Employee(eNo, eName, eSalary);
        }

        // Search for employee
        System.out.print("Enter Employee Number to search: ");
        int searchNo = sc.nextInt();

        // Check if employee exists and display details
        boolean found = false;
        for (Employee emp : empArray) {
            if (emp.eNo == searchNo) {
                emp.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found!");
        }

        sc.close();
    }
}

