import java.util.*;

public class EmployeesPredicate {
  public static void main(String args[]) {
    Employee[] staff = Employee.getStaff();
    WellPaid makes52k = new WellPaid();

    System.out.println("Well-paid IT:");
    Arrays.stream(staff).filter(makes52k)
      .forEach(e -> System.out.println("Match: " + e.getName()));

      System.out.println("\nPoorly-paid IT:");
  Arrays.stream(staff).filter(makes52k.negate().and(e -> e.getDepartment().equals("IT")))
    .forEach(e -> System.out.println("Match: " + e.getName()));

  }
}
