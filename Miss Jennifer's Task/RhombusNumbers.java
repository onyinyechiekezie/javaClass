import java.util.Scanner;
public class RhombusNumbers {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int n = input.nextInt();
	for(int i=1; i<=n; i++)  {
		int k=1;
		for(int j=i; j<=n; j++) 
			System.out.print("  ");
		for(int j=1; j<i; j++) 
			System.out.print(k++ +" ");
		for(int j=1; j<=i; j++) 
			System.out.print(k-- +" ");


		System.out.println();
	}


	

}
}

