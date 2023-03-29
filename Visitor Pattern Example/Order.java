public class Order implements Visitable{
  double totalAmount;

  public double getTotalAmount() {
    return totalAmount;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
