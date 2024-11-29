import java.util.Scanner;
public class Length {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter take-off speed in meter per second: ");
double speed = input.nextDouble();
System.out.print("Enter accelerationn in meter per second square: ");
double acceleration = input.nextDouble();

double length = speed * speed / 2 * acceleration;

System.out.printf("Minimum runway length is: %.2f", length);


}
}

