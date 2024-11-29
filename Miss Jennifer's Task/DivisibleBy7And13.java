import java.util.Scanner;
public class DivisibleBy7And13 {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	int number = 0;
	while(number % 7 == 0 && number % 13 == 0)  {
	System.out.print("Give me a number that is divisible by 7 and 13: ");
	number = input.nextInt();
		if(number % 7 != 0 && number % 13 != 0) { 
			System.out.print("Number not found. Try again");
		}else {
			System.out.print("Hurray! You got the right number!\n");
		}
	}

}
}
	

	