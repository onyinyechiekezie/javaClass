import java.util.Scanner;
public class NumberPower {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter base number:");
double base = input.nextDouble();

System.out.print("Enter an exponent:");
double exponent = input.nextDouble();

double numberPower = Math.pow(base, exponent);

System.out.printf("%.1f raised to the power of %.1f is: %.1f%n", base,exponent,numberPower);


}
}  