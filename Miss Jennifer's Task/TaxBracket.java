import java.util.Scanner;
public class TaxBracket  {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter annual income: ");
	int income = input.nextInt();

	if(income == 0 || income <= 9875) {
		System.out.print("10%");
	}else if(income == 9876 || income <= 40125) {
		System.out.print("12%");
	}else if(income == 40126 || income <= 85525) {
		System.out.print("22%");
	}else if(income > 85526) {
		System.out.print("24%");
	}




}
}

