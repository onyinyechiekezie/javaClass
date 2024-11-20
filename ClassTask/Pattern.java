import java.util.Scanner;
public class Pattern  {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter an integer: ");
	int number = input.nextInt();
	for(int index = 0; index <= number; index++) {
		for(int counter = index; counter <= number; counter++) {
		System.out.print("XO ");
		}
	System.out.println();
	}

}
}