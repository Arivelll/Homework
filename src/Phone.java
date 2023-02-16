import java.sql.SQLOutput;

public class Phone {
  static String colour = "Black";
  int battery;

  public static void call(){
    System.out.println("Call somebody");
  }
  void charge(){
    System.out.println("The phone is charging");
  }


  Phone(int battery) {
    this.battery = battery;

 while (battery < 100) {
      System.out.println("The battery is charging! Don't disconnect the charger! " + battery + "%");
      battery++;
    }
    System.out.println("The battery is charged! 100% ");

   /* do {
      System.out.println("The battery is charging! Don't disconnect the charger! " + battery + "%");
      battery++;
    } while (battery < 100);
    */
    // С do while получается то же самое, ничего не меняется
  }
}
