package pro.sky.skypro_Maven_Spring;

import java.util.List;

public class DepartmentEmployees {

    private int departmentId;
    private List<Employee> employees;

    public DepartmentEmployees(int departmentId, List<Employee> employees) {
        this.departmentId = departmentId;
        this.employees = employees;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

