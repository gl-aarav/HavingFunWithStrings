public class Q4{
  public static void main (String [] args){
    String name="Jones, Bob";
    String beg, end;
    beg = name.substring(7);
    System.out.print(beg);
    end = name.substring(0,5);
    System.out.println(" " + end);
    }
}