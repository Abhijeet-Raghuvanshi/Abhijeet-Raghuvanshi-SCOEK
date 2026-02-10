import java.util.Scanner;

public class Table{
 public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first Number: ");
      int num1 = input.nextInt();
      System.out.print("Enter the second Number: ");
     int num2 = input.nextInt();

      int sum = num1 + num2;
      System.out.println("Sum is " + sum);
  }
}