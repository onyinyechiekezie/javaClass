 import java.util.Scanner;
public class LargestSmallest {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a number or 'q' to quit:" );
double number = input.nextDouble();

double largest = double NEGATIVEINFINITY;
double smallest = double POSITIVEINFINITY;

if(number > smallest) {
largest = number;
}
if(number < smallest) {
smallest = number;
}
if(largest != double NEGATIVEINFINITY && smallest != double POSITIVEINFINITY) {

System.out.printf("Largest number is: %.2f", largest);
System.out.printf("Smallest number is: %.2f", smallest);

 