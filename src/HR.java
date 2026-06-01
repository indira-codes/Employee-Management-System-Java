package src;
import java.util.ArrayList;

class HR{
    private ArrayList<Employee> employees = new ArrayList<>();

    // ADD EMPLOYEES
public void addEmployee(Employee e){

    if(searchEmployee(e.getEmpId()) != null){
        System.out.println("Employee ID already exists!");
        return;
    }
    employees.add(e);
    System.out.println("Employee Added Successfully!");
}
// view all employees
public void viewEmployees(){
    for(Employee e :employees ){
        System.out.println(e);
    }
}

// search employees
public Employee searchEmployee(int id){
    for(Employee e : employees){
        if(e.getEmpId() == id){
            return e;
        }
    }
    return null;
}

// delete employee
public void deleteEmployees(int id){
    Employee found = searchEmployee(id);

    if(found != null){
        employees.remove(found);
        System.out.println("Employee deleted");
    } else {
        System.out.println("Employee not found");
    }
}

// update salary
public void updateSalary(int id, long newSalary){
    Employee e = searchEmployee(id);
    if(e != null){
        e.setSalary(newSalary);
        System.out.println("Salary updated");
    } else {
        System.out.println("Employee not found");
    }
}
}