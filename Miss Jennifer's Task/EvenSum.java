import java.util.Scanner;
public class EvenSum {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	int integer1 = 1;
	int integer2 = 1;
	int counter = 1;
	int sum1 = 0;
	int sum2 = 0;
	int sum = 0;

	while(integer1 > 0 && integer2 > 0)  {


		System.out.print("Enter an integer: ");
		integer1 = input.nextInt();
		System.out.print("Enter an integer: ");
		integer2 = input.nextInt();
		counter++;
		if(integer1 > integer2)  {  
			System.out.print("Invalid input. Second integer must be greater than the first\n");
		 break;
		}
		if(integer1 < 0 || integer2 < 0)  {  
			System.out.print("Invalid input. Integer must be positive\n");
		  break;
		}

			if(integer1 % 2 == 0) 
				sum1 = sum1 + integer1;
			if(integer2 % 2 == 0) 
				sum2 = sum2 + integer1;
			sum = sum1 + sum2;
		System.out.print("Sum of even numbers between " + integer1 + " and " + integer2 + " is " + sum + "\n");
		

	}

}
}
		
		

		 			



