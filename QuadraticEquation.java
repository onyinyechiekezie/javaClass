import java.util.Scanner;

public class QuadraticEquation  {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    double number1 = input.nextDouble();
    System.out.print("Enter a number: ");
    double number2 = input.nextDouble();
    System.out.print("Enter a number: ");
    double number3 = input.nextDouble();

    double determinant = number2 * number2 - 4 * number1 * number3;
if(determinant > 0) {
    double root1 = (-number2 + Math.sqrt(determinant) / 2 * number1);
    double root2 = (-number2 - Math.sqrt(determinant) / 2 * number1);
  System.out.println("The roots are " + root1 + " and " + root2);


}
}
}
    