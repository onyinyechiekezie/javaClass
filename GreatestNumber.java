import java.util.Scanner;
public class GreatestNumber {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
double firstNumber = input.nextDouble();
System.out.print("Enter second number: ");
double secondNumber = input.nextDouble();
System.out.print("Enter third number: ");
double thirdNumber = input.nextDouble();

if(firstNumber > secondNumber && firstNumber > thirdNumber) {
System.out.printf("%.1f is the greatest", firstNumber);
}
if(secondNumber > firstNumber && secondNumber > thirdNumber) {
System.out.printf("%.1f is the greatest", secondNumber);
}
if(thirdNumber > firstNumber && thirdNumber > secondNumber) {
System.out.printf("%.1f is the greatest", thirdNumber);
}

}
}
 


