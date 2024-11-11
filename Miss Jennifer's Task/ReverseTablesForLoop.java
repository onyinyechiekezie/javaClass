import java.util.Scanner;
public class ReverseTablesForLoop  {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	for(int counter = 10; counter > 1; counter--)  {
		for(int count = 5; count > 1; count--)  {
		int product = counter * count;
		System.out.print(count + "*" + counter + "=" + product + "\n");
		System.out.println();
		}
	}


}
}


