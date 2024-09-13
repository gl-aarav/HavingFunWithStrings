import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String saying, letter;
    System.out.println("Write a saying or any sentence");
    saying = in.nextLine();
    System.out.print("Your saying has ");
    System.out.print(saying.length());
    System.out.println(" character(s).");
    letter = saying.substring(4, 5);
    System.out.println("The 4th subscript location in your saying is: " + letter);
  }
}