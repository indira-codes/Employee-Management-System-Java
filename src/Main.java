package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        HR hr = new HR();

        while(true){
            System.out.println("\n===== Employee Management System ====");
            System.out.println("1. Add zEmployees");
            System.out.println("2. view Employees");
            System.out.println("3. Search Employees");
            System.out.println("4. Update zEmployees");
            System.out.println("5. Delete Employees");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();
            switch(choice){

                case 1:
                System.out.print(" Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Salary: ");
                long salary = sc.nextLong();

                Employee e = new Employee(id, name, salary);
                hr.addEmployee(e);
                System.out.println(e);

                break;

                case 2:
                System.out.println(" View all Employees");
                hr.viewEmployees();
                break;

                case 3:
                System.out.println(" Enter Employee ID to search: ");
                int searchId = sc.nextInt();

                Employee found = hr.searchEmployee(searchId);

                if(found != null){
                    System.out.println(found);
                } else {
                    System.out.println("Employee not found.");
                }
                break;

                case 4: 
                System.out.print(" Enter Employee ID: ");
                int updateId = sc.nextInt();

                System.out.print("Enter New Salary: ");
                long newSalary = sc.nextLong();

                hr.updateSalary(updateId, newSalary);
                break;

                case 5:
                System.out.print(" Enter Employee ID to delete: ");
                int deleteId = sc.nextInt();
                hr.deleteEmployees(deleteId);
                break;

                case 6:
                System.out.println(" Thank You!");
                sc.close();
                return;

                default:
                System.out.println("Invalid Choice!");
            }

        }
    } 
}
