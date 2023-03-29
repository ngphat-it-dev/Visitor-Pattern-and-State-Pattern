public class HotDrinkState implements State {
  @Override
  public void dispenseDrink(VendingMachine context) {
    System.out.println("Dispensing hot drink...");
    context.setState(new ColdDrinkState());
  }

  @Override
  public String getTemperature() {
    return "Hot";
  }
}
