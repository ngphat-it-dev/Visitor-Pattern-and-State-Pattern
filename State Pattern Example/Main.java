public class Main {
  public static void main(String[] args) {
    VendingMachine vendingMachine = new VendingMachine();
    vendingMachine.dispenseDrink(); // Dispensing hot drink...
    vendingMachine.dispenseDrink(); // Dispensing cold drink...
    vendingMachine.dispenseDrink(); // Dispensing room temperature drink...
    vendingMachine.dispenseDrink(); // Dispensing hot drink...
  }
}
