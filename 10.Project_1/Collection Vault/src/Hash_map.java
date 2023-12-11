import java.util.HashMap;

public class Hash_map {

    public static void main(String[] args) {
        HashMap<Integer, Double> employeeData = new HashMap<>();

        employeeData.put(1234, 50000.0);
        employeeData.put(5678, 65000.0);
        employeeData.put(9012, 70000.0);
        employeeData.put(3456, 45000.0);
        employeeData.put(7890, 80000.0);

        System.out.println("Employee Data:");
        for (Integer employeeId : employeeData.keySet()) {
            Double salary = employeeData.get(employeeId);
            System.out.println("Employee ID: " + employeeId + " - Salary: " + salary);
        }

        double averageSalary = 0.0;
        for (Double salary : employeeData.values()) {
            averageSalary += salary;
        }
        averageSalary /= employeeData.size();
        System.out.println("Average Salary: " + averageSalary);
    }
}