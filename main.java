import java.util.Scanner;

public class main {

  public static void main(String ... args){
    Scanner input = new Scanner(System.in);
    System.out.println("Write your text:");
    String text = input.nextLine();  

    for(int i = text.length() - 1; i > -1; i--){
      System.out.print(text.charAt(i));
    }
    System.out.println(" ");
  }
}
