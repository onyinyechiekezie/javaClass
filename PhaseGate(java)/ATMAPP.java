import java.util.Scanner;
public class ATMAPP  {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		printDesign();
		System.out.printf("\t\t\t\t%s%n\t\t\t%s%n\t\t%s%n", "Hi there!","WELCOME TO BANKE BANK", "(Experience The Best In Banking With Us)");
		printDesign();
		System.out.print("Kindly choose an option\n1.Create an account\n2.Close account\n3.Deposit money\n4.Withdraw money\n5.Check Account balance\n6.Make a transfer\n7.Change pin\n");
		int option = input.nextInt();
		switch(option)  {
			case 1: createAccount(input);
					break;
		} 

	}
	public static void printDesign()  {
		System.out.println("````````````````````````````````````````````````````````````````````````````");
	}
	public static void createAccount(Scanner input) {
		String firstName = " ";
		String lastName = " ";
		
		String response = " ";
		int index = 0;
		do {
		System.out.println("Please enter your first name: ");
		firstName = input.next();
		System.out.print("Please enter your last name: ");
		lastName = input.next();
		System.out.print("Enter your pin(4 digits): ");
		int pin = input.nextInt();
		String pinStr = String.valueOf(pin);
		index++;
			//for(int counter =0; counter < firstName.length; counter++){
				if(firstName.equals(" "))
					System.out.print("Valid. Weldone");
				else 
					System.out.print("Invalid input. Please enter your name: ");
				
				if(pinStr.length() != 4)
					System.out.print("Invalid input. Please enter a 4 digit pin: ");
				else
					System.out.print("PIN accepted");
			//}
			
			System.out.print("Do you want to create another account? (yes/no): ");
			response = input.nextLine();
		}
		while(response.equals("yes"));
	}
   

}
	


	
			
		


		