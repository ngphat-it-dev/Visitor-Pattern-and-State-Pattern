public class VendingMachine {
  private State state;

  public VendingMachine() {
    this.state = new HotDrinkState(); // Default state is hot drink
  }

  public void setState(State state) {
    this.state = state;
  }

  public void dispenseDrink() {
    state.dispenseDrink(this);
    System.out.println("Current drink temperature: " + state.getTemperature());
  }
}
