import java.util.Scanner;
public class NumberSumLoop {
public static void main(String[] args)  {

Scanner input = new Scanner(System.in);

double number1 = 0;
double number2 = 0;
String choice = " ";

do  {
  System.out.print("Enter a number: ");
  number1 = input.nextDouble();
  System.out.print("Enter second number: ");
  number2 = input.nextDouble();
  
 double sum = number1 + number2;
  System.out.println("Sum is " + sum);


System.out.println("Would you like to continue? ");
  choice = input.next();

}

while(choice.equals("yes"));


}
}