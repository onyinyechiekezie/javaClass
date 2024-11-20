import java.util.Scanner;
public class ReverseTables  {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);


	int counter = 6;
	int count = 10;
	while(counter >1)  {
		System.out.print("Table "+counter+" \n");
		counter--;
		for(count=10; count>1; count--)  {

		int product = counter * count;
		System.out.print(counter + "*" + count + "=" + product + "\n");
		System.out.println();
	
		}
	}


}
}

