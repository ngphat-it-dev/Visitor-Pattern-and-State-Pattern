public class Customer implements Visitable{
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
