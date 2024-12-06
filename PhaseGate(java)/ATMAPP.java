import java.util.Scanner;
public class ATMAPP  {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		int option = 0;
		printDesign();
		System.out.printf("\t\t\t\t%s%n\t\t\t%s%n\t\t%s%n", "Hi there!","WELCOME TO BANKE BANK", "(Experience The Best In Banking With Us)");
		printDesign();
		while(option !=8) { 
		System.out.print("Kindly choose an option\n1.Create an account\n2.Close account\n3.Deposit money\n4.Withdraw money\n5.Check Account balance\n6.Make a transfer\n7.Change pin\n8.Exit\n");
		option = input.nextInt();
		switch(option)  {
			case 1: createAccount(input);
					break;
			case 2: closeAccount(input);
		} 
		}
	}
	public static void printDesign()  {
		System.out.println("````````````````````````````````````````````````````````````````````````````");
	}
	public static void createAccount(Scanner input) {
		
		String response = " ";
		int index = 0;
		do {
		System.out.println("Please enter your first name: ");
		String firstName = input.next();
		System.out.print("Please enter your last name: ");
		String lastName = input.next();
		System.out.print("Enter your PIN(4 digits): ");
		int pin = input.nextInt();
		String pinStr = String.valueOf(pin);
			if(pinStr.length() != 4) {
				System.out.println("Invalid input. Please enter a 4 digit PIN: ");
			}else{
				System.out.println("PIN accepted");
			}

			
			System.out.println("Do you want to continue? ");
			response = input.nextLine();
		index++;
		}
		while(response.equals("yes"));
	}
	public static void closeAccount(Scanner input) {
		System.out.println("Enter account number(10 digits)");
		int accountNumber = input.nextInt();
		String accountNumberStr = String.valueOf(accountNumber);
		if(accountNumberStr.length() != 10) { 
			System.out.println("Account number should be 10 digits");
		}
		System.out.println("Enter your PIN");
		int pin2 = input.nextInt();
		System.out.print("Are you sure you want to close this account? (yes/no): ");
		String decision = input.nextLine();
		if(decision.equals("yes"))
			System.out.print("Account closed successfully");
		else
			System.out.print("Account closure cancelled");

	}			
   

}
	


	
			
		


		