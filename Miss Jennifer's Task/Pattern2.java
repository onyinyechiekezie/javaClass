import java.util.Scanner;
public class Pattern2 {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();
	for(int rows = 1; rows < (number + 1); rows++)  {
		for(int column = 1; column < (rows + 1); column++) {
			System.out.print(column);
		}
		System.out.println();

	}


}
}












