package pro.sky.skypro_Maven_Spring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Иванов Николай Евгеньевич", 85000, 3));
        employees.add(new Employee("Аватков Иван Олегович", 80000, 3));
        employees.add(new Employee("Паравозова Ольга Викторовна", 70500, 1));
        employees.add(new Employee("Орлов Степан Иванович", 92050, 2));
        employees.add(new Employee("Романов Иван Сергеевич", 105000, 4));
        employees.add(new Employee("Гусев Матвей Михайлович", 115000, 4));
        employees.add(new Employee("Егоров Владлен Данилович", 17000, 1));
        employees.add(new Employee("Морозов Ермолай Сергеевич", 60000, 5));
        employees.add(new Employee("Шарапов Корней Алексеевич", 37000, 3));
        employees.add(new Employee("Самсонов Иосиф Никитевич", 13000, 5));
    }

    public Employee getEmployeeWithMaxSalary(int departmentId) {
        return employees.stream()
                .filter(e -> e.getNumberDepartment() == departmentId)
                .max((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()))
                .orElse(null);
    }

    public Employee getEmployeeWithMinSalary(int departmentId) {
        return employees.stream()
                .filter(e -> e.getNumberDepartment() == departmentId)
                .min((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()))
                .orElse(null);
    }

    public List<Object> getAllEmployeesByDepartment(Integer departmentId) {
        if (departmentId == null) {
            return employees.stream()
                    .collect(Collectors.groupingBy(Employee::getNumberDepartment))
                    .entrySet().stream()
                    .map(entry -> new DepartmentEmployees(entry.getKey(), entry.getValue()))
                    .collect(Collectors.toList());
        }
        return employees.stream()
                .filter(e -> e.getNumberDepartment() == departmentId)
                .collect(Collectors.toList());
    }
}
