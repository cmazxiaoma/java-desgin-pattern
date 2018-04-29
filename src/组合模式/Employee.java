package 组合模式;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;
    
    public Employee(String name, String dept, int salary) {
        super();
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }
    
    public void add(Employee e) {
        if (e != null) {
            subordinates.add(e);
        }
    }
    
    public void remove(Employee e) {
        if (e != null) {
            subordinates.remove(e);
        }
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", subordinates=" + subordinates
                + "]";
    }
}
