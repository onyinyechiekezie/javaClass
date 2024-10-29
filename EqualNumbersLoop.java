import java.util.Scanner;
public class EqualNumbersLoop {
public static void main(String[] args)  {

Scanner input = new Scanner(System.in);

double number1 = 0;
double number2 = 0;
double number3 = 0;
String choice = " ";

do  {
  System.out.print("Enter a number: ");
  number1 = input.nextDouble();
  System.out.print("Enter second number: ");
  number2 = input.nextDouble();
  System.out.print("Enter third number: ");
  number3 = input.nextDouble();
if(number1 == number2 && number1 == number3)  {
  System.out.println("Numbers are equal");
} else {
  System.out.println("Numbers are not equal");
}

System.out.println("Would you like to continue? ");
  choice = input.next();
}
while(choice.equals("yes"));


}
}