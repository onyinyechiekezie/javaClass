/** A program that reads number in feet and converts it to meters and displays the result */
import java.util.Scanner; // program uses class Scanner
public class Meters {
public static void main(String[] args) { // main method begins execution of java application

Scanner input = new Scanner(System.in); // create a Scanner to obtain input from the command window

System.out.print("Enter number in feet:"); // prompt user 
double feet = input.nextDouble(); // read number from user

double meters = feet * 0.305; // calculate and store in meters

System.out.printf("Result is: %.2f",  meters); // display meters

} // end method main
} //end class Meters




