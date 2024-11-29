import java.util.Scanner;
public class Balance {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);
	int counter = 1;
	for(;counter <=3;) {
		System.out.print("Enter amount of savings: ");
		int savings = input.nextInt();
		System.out.println("Enter amount of expenses: ");
		int expenses = input.nextInt();
		
		int balance = savings - expenses;
		counter++;
		
		System.out.println("Balance is" + balance);
	}

}
}