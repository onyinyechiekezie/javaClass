import java.util.Scanner;
public class Triangle {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();
	for(int rows=1; rows <=number; rows++)  {
		for(int column=rows; column<=number; column++)
			System.out.print("");
		for(int column=1; column<=rows; column++)
			System.out.print("@");
		System.out.print();
	}

}
}
