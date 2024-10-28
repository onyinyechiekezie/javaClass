import java.util.Scanner;
public class Kilograms1 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a number in pounds: ");
double pounds = input.nextDouble();

double kilograms = pounds * 0.454;

System.out.printf("Pounds converted to kilograms is: %.2f", kilograms);



}
}
