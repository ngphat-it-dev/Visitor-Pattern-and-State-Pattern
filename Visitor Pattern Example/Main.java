import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Customer customer1 = new Customer();
    Customer customer2 = new Customer();
    Order order1 = new Order();
    order1.totalAmount = 100.0;
    Order order2 = new Order();
    order2.totalAmount = 200.0;
    Invoice invoice1 = new Invoice();
    invoice1.totalAmount = 500.0;
    Invoice invoice2 = new Invoice();
    invoice2.totalAmount = 1000.0;

    // Add visitors to visitable objects
    List<Visitable> visitableObjects = new ArrayList<>();
    visitableObjects.add(customer1);
    visitableObjects.add(customer2);
    visitableObjects.add(order1);
    visitableObjects.add(order2);
    visitableObjects.add(invoice1);
    visitableObjects.add(invoice2);

    // Generate report
    ReportVisitor reportVisitor = new ReportVisitor();
    for (Visitable visitableObject : visitableObjects) {
      visitableObject.accept(reportVisitor);
    }

    // Display report
    System.out.println("Total sales: " + reportVisitor.getTotalSales());
    System.out.println("Average order size: " + reportVisitor.getAverageOrderSize());
    System.out.println("Total customers: " + reportVisitor.getTotalCustomers());
  }
}
