import java.util.Scanner;
public class SumNumbers  {
   public static void main(String[] args)  {

Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
int number1 = input.nextInt();
System.out.print("Enter second number: ");
int number2 = input.nextInt();

System.out.println(number1 > number2?"greater!":"Not great");
  
int sum = number1 + number2;

System.out.println(sum > 50?"even sum is greater":"Not greater");
  



}
}
