public class ColdDrinkState implements State{
  @Override
  public void dispenseDrink(VendingMachine context) {
    System.out.println("Dispensing cold drink...");
    context.setState(new RoomTempDrinkState());
  }

  @Override
  public String getTemperature() {
    return "Cold";
  }
}
