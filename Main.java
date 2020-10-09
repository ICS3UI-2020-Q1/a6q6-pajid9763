import java.util.Scanner;

/**
 * program for Fibonacci sequence
 * @author Darian 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask the user for a Fibonacci number
    System.out.println("What Fibonacci number would you like to find");
    int num = input.nextInt();
    int numbers[] = new int[num];
    numbers[0] = 0;
    numbers[1] = 1;

    int sum = 0;

    for (int i = 1; i < numbers.length; i++) {
      sum = numbers[0] + numbers[1];
      numbers[0] = numbers[1];
      numbers[1] = sum;

    }
    System.out.println("The " + num + " Fibonacci number is " + sum);
  }
}
