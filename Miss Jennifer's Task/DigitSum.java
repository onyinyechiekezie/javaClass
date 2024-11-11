import java.util.Scanner;
public class DigitSum {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	int sum = 0;
	int remainder = 0;

	System.out.print("Enter an integer: ");
	int number = input.nextInt();
	while(number > 0)  {
		remainder = number % 10;
		sum = sum + remainder;
		number = number / 10;
	System.out.print("Sum is " + sum + "\n");
	}

}
}




