import java.util.Scanner;
public class EqualNumbers {
public static void main(String[] args)  {

Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
double number1 = input.nextDouble();
System.out.print("Enter second number: ");
double number2 = input.nextDouble();
System.out.print("Enter third number: ");
double number3 = input.nextDouble();

if(number1 == number2 && number1 == number3)  {
  System.out.println("Numbers are equal");
} else {
  System.out.println("Numbers are not equal");
}


}
}
