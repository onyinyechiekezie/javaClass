import java.util.Scanner;
public class PhoneBook  {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

		

		printDesign();
		System.out.printf("\t\t\t%s%n", "PHONEBOOK APP");
		printDesign();
		System.out.print("Kindly choose an option\n1.Add contact\n2.Remove contact\n3.Find contact by Phone number\n4.Find contact by first name\n5.Find contact by last name\n6.Edit contact\n");
		int option = input.nextInt();
		switch(option)  {
			case 1: addContact(input);
					break;
		}

	}
	
	public static void printDesign()  {
		System.out.println("````````````````````````````````````````````````````````````````````````````");
	}
	public static void addContact(Scanner input) {
		String[] name = new String[10];		
		int[] number = new int[10];
		String[] numberStr = new String[10];
		String response = " "; 
		do {
			for(int index = 0; index < name.length; index++) {
				System.out.print("Enter name: ");
				name[index] = input.next();
				System.out.print("Enter phone number: ");
				number[index] = input.nextInt();
				//numberStr[index] = String.valueOf(number);
				
				System.out.print("Contact added successfully\n");
			}
			System.out.println("Would you like to add another contact? (yes/no): ");
			response = input.nextLine();
			
		}
		while(response.equals("yes"));
		//if(index > name.length) 
			System.out.print("Phone book is full");
			
		
	}

}





