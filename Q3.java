import java.util.Scanner;
public class Q3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String name, address, cityzip;
    System.out.println("What is your name?");
    name = in.nextLine();
    System.out.println("What is your address?");
    address = in.nextLine();
    System.out.println("What is your city state zip?");
    cityzip = in.nextLine();
    System.out.println("\nHere is what you entered:");
    System.out.println(name);
    System.out.println(address);
    System.out.println(cityzip);
    System.out.print("\nYour city has ");
    String city= cityzip;
    System.out.print (city.indexOf(","));
    System.out.println(" letters.");
  }
}