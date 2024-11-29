import java.util.Scanner;
public class Integers {
	public static void main(String[] args)  {

	Scanner input = new Scanner(System.in);
	for(int index = 1; index <= 10; index++)  {
		System.out.print("Enter an integer: ");
		int value = input.nextInt();
		if(value >= 50) 
			System.out.println("You have been promoted to the next stage");
	}

}
}