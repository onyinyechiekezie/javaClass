import java.util.Scanner;
public class BodyMassIndex {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pounds: ");
double pounds = input.nextDouble();
System.out.print("Enter hiegth in inches: ");
double inches = input.nextDouble();

double kilograms = pounds * 0.45359237;
double meters = inches * 0.0254;
double bodyMassIndex = kilograms / (meters * meters);

System.out.printf("Body mass index is: %.2f", bodyMassIndex);


}
}


