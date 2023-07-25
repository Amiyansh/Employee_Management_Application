
import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("****************Welcome To Employee Management System *********** ");
                System.out.println("1. Add Employee ");
                System.out.println("2. View Employee");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. View All Employee");
                System.out.println("6. Exit ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();
        boolean ordering = true; 

        while (ordering) { 
            menu();
            System.out.println("Enter your Choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Employee");
                    service.addEmp();
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.viewEmp();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    service.updateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    service.deleteEmp();
                    break;
                case 5:
                    System.out.println("View All Employee");
                    service.viewAllEmps();
                    break;
                case 6:
                    System.out.println("Thank you for using the application!!");
                    ordering = false; 
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
        }

        sc.close(); 
    }
}
