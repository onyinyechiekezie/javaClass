import java.util.Scanner;
public class ReverseNaturalNumbers {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a positive integer: ");
	int number = input.nextInt();
	if(number <= 0) 
		System.out.print("Number must be positive");
	for(int counter = number; counter >=1; counter--) {
		System.out.print(counter);
		System.out.println();
		
	}

}
}

	


