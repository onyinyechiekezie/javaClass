import java.util.Scanner;
public class Water {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter amount of water in kilograms: ");
double kilograms = input.nextDouble();
System.out.print("Enter initial temperature of water: ");
double initialTemperature = input.nextDouble();
System.out.print("Enter final temperature of water: ");
double finalTemperature = input.nextDouble();

double energy = kilograms * (finalTemperature - initialTemperature) * 4184;

System.out.printf("Energy needed is: %.2f", energy);

}
}

