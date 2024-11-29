import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	int number = 1;
	int sum = 0;
	
	while(number > 0)  {
		System.out.print("Give me a positive integer: ");
		number = input.nextInt();
		
		if(number <= 0)
			System.out.print("A positive integer required");
		for(int counter = 1; number > counter; counter++)  {
			if(number % counter == 0) 
				sum = sum + counter;
		}
			if(sum == number) {
				System.out.printf("%d is a perfect number\n", number);
			}else {
				System.out.printf("%d is not a perfect number\n", number);
			}
		
	}

}
}