import java.util.Scanner;
public class  HCF {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	for(int index = 1; index <=2; index++)  {
		System.out.print("Enter number"+index+" ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int hcf = 1;
		for(int count = 1; count <= Math.min(number1, number2); count++)  {
			if(number1 % count == 0 && number2 % count == 0)  {
				hcf = count;
		
		System.out.print("HCF is " + hcf);

			}
		}
			
		
	}


}
}

