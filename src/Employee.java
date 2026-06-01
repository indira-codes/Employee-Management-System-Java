package src;
class Employee{
    private int empId;
    private String empName;
    private long salary;

    public Employee(int empId, String empName, long salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId(){
        return empId;
    }

    public String getEmpName(){
        return empName;
    }
    public long getSalary(){
        return salary;
    }

    public void setSalary(long salary){
        this.salary = salary;
    }

    public String toString(){
        return empId + " | " + empName + " | " + salary;
    }

}