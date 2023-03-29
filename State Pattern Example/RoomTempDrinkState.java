public class RoomTempDrinkState implements State{
  @Override
  public void dispenseDrink(VendingMachine context) {
    System.out.println("Dispensing room temperature drink...");
    context.setState(new HotDrinkState());
  }

  @Override
  public String getTemperature() {
    return "Room temperature";
  }
}
