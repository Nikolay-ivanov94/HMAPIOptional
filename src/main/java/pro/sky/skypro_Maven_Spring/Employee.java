package pro.sky.skypro_Maven_Spring;

import java.util.Objects;

public class Employee {

    private static int idGenerator = 1;

    private int id;
    private String fullName;
    private int salary;
    private int numberDepartment;

    public Employee(String fullName, int salary, int numberDepartment) {
        this.id = idGenerator++;
        this.fullName = fullName;
        this.salary = salary;
        this.numberDepartment = numberDepartment;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getNumberDepartment() {
        return numberDepartment;
    }

    public int getId() {
        return id;
    }

    public void setNumberDepartment(int numberDepartment) {
        this.numberDepartment = numberDepartment;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                salary == employee.salary &&
                numberDepartment == employee.numberDepartment &&
                Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, salary, numberDepartment);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", numberDepartment=" + numberDepartment +
                '}';
    }
}

