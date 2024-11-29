import java.util.Scanner;
public class NumberLoop {
	public static void main(String[] args) {
 		Scanner input = new Scanner(System.in);

 		String reply;
		//boolean condidion = false;
  		do {
 			System.out.print("Enter first number: ");
			double firstNumber = input.nextDouble();
 			System.out.print("Enter second number: ");
 			double secondNumber = input.nextDouble();
 			double sum = firstNumber + secondNumber;
 			System.out.printf("Sum of numbers are: %.1f\n", sum);

			//System.out.print("Do you wish to perform the operation again? Yes/No ");
  			//reply = input.next();
			
 		}while(true);

}
}


