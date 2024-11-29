import java.util.Scanner;
public class Temperature  {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter temperature in celcuis: ");
	int temperature = input.nextInt();

	if(temperature < 10) {
		System.out.print("Cold");
	}else if(temperature == 10 || temperature <= 25) {
		System.out.print("Warm");
	}else if(temperature > 25) {
		System.out.print("Hot");
	}




}
}
