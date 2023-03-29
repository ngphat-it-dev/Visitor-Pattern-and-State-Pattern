public class ReportVisitor implements Visitor{
  private double totalSales;
  private int totalOrders;
  private int totalCustomers;
  @Override
  public void visit(Customer customer) {
    totalCustomers++;
  }

  @Override
  public void visit(Order order) {
    totalOrders++;
    totalSales += order.getTotalAmount();
  }

  @Override
  public void visit(Invoice invoice) {
    totalSales += invoice.getTotalAmount();
  }

  // Getters for report data
  public double getTotalSales() {
    return totalSales;
  }

  public double getAverageOrderSize() {
    if (totalOrders == 0) {
      return 0;
    }
    return totalSales / totalOrders;
  }

  public int getTotalCustomers() {
    return totalCustomers;
  }

}
