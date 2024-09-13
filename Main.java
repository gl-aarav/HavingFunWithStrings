import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String lastname;
    
    System.out.println("What is your last name?");
    lastname = in.nextLine();
    lastname = lastname + "@google.com";
    System.out.println("Your email is " + lastname);
  }
}