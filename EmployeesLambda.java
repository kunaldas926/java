import java.util.*;

public class EmployeesLambda {
  public static void main(String args[]) {
    Employee[] staff = Employee.getStaff();
    Arrays.stream(staff).filter(e -> { 
        String d = e.getDepartment().toLowerCase();
        return d.equals("it") && e.getSalary() > 52000.0;
      }).forEach(e -> System.out.println("Match: " + e.getName()));
  }
}
