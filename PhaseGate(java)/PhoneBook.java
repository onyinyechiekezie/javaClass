import java.util.Scanner;
public class PhoneBook  {

	public static String[] firstNames = new String[50];
	public static String[] lastNames = new String[50];	
	public static String[] phonenumbers = new String[50];
	public static int count = 0;

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

		int option = 0;
		printDesign();
		System.out.printf("\t\t\t%s%n", "PHONEBOOK APP");
		printDesign();
		while(option != 8) {
		System.out.print("Kindly choose an option\n1.Add contact\n2.Remove contact\n3.Find contact by Phone number\n4.Find contact by first name\n5.Find contact by last name\n6.Edit contact\n7.Exit\n");
		option = input.nextInt();
		switch(option)  {
			case 1: addContact(input);
					break;
			case 2: removeContact(input);
					break;
			case 3: findContactByPhoneNumber(input);
					break;
			case 4: findContactByFirstName(input);
					break;
			case 5: findContactByLastName(input);
					break;
			case 6: editContact(input);
					break;
			case 7: System.out.print("Exit");
					break;
		}
		}
	}
	
	public static void printDesign()  {
		System.out.println("````````````````````````````````````````````````````````````````````````````");
	}

	public static void addContact(Scanner input) {
		String response = " "; 
		do {
			if(count > phonenumbers.length) {
				System.out.print("Phone book is full\n");
			}else{
				try{
				for(int index = 0; index < phonenumbers.length; index++){
				System.out.print("Enter first name: ");
				firstNames[index] = input.next();
				System.out.print("Enter last name: ");
				lastNames[index] = input.next();
				System.out.print("Enter phone number: ");
				String phonenumber = input.next();
				if(phonenumber.length() == 11){
					phonenumbers[index] = phonenumber;
					System.out.print("Contact added successfully\n");
				}else{
					System.out.print("Wrong input!\n");
				}
				break;
				}
				}catch(Exception e) {
					System.out.print("Wrong input!");
				}
				
			}
			
			System.out.println("Would you like to add another contact? (yes/no): ");
			response = input.next();
			
		}
		while(response.equals("yes"));
	}
	public static void removeContact(Scanner input) {
		System.out.print("Enter phone number to be removed\n");
		String number = input.next();
		for(int index = number.length(); index < count - 1; index++) {
			if(!phonenumbers[index].equals(number)) { 
				System.out.print("Contact not found.\n");
			}else{
				firstNames[index] = firstNames[index + 1];
				lastNames[index] = lastNames[index + 1];
				phonenumbers[index] = phonenumbers[index + 1];
			}
		}
		count--;
		System.out.print("Contact has been removed.\n");				
				
	}

	public static void findContactByPhoneNumber(Scanner input) {
		System.out.print("Enter phone number\n");	
		String number = input.next();
		try{
		for(int index = 0; index < phonenumbers.length; index++) {
			if(phonenumbers[index].equals(number)) {
				System.out.print("Name " + firstNames[index] + "Last name " + lastNames[index] + "\n" + "Phonenumber " + phonenumbers[index] + "\n");
			 }else{
				System.out.print("Contact not found!\n");
			}
		}
		}catch(Exception e ){
			System.out.print("\n");
		}
		
	}

	public static void findContactByFirstName(Scanner input) {
		System.out.print("Enter first name\n");	
		String firstname = input.next();
		try{
		for(int index = 0; index < firstNames.length; index++) {
			if(firstNames[index].equals(firstname)) {
				System.out.print("Name " + firstNames[index] + "Last name " + lastNames[index] + "\n" + "Phonenumber " + phonenumbers[index] + "\n");
			 }else{
				System.out.print("Contact not found!\n");
			}
		}
		}catch(Exception e ){
			System.out.print("\n");
		}
		
	}

	public static void findContactByLastName(Scanner input) {
		System.out.print("Enter last name\n");	
		String lastname = input.next();
		try{
		for(int index = 0; index < lastNames.length; index++) {
			if(lastNames[index].equals(lastname)) {
				System.out.print("Name " + firstNames[index] + "Last name " + lastNames[index] + "\n" + "Phonenumber " + phonenumbers[index] + "\n");
			 }else{
				System.out.print("Contact not found!\n");
			}
		}
		}catch(Exception e ){
			System.out.print("\n");
		}
		
	}

	public static void editContact(Scanner input) {
		System.out.print("Enter phone number\n");	
		String number = input.next();
	
		for(int index = 0; index < phonenumbers.length; index++) {
			if(phonenumbers[index].equals(number)) {
				System.out.print("Enter new number");
				String newNumber = input.next();
				phonenumbers[index] = newNumber;
				break;
			}else{
				System.out.print("Number not found");
			}
		}
			if(phonenumbers.length > 0) {
				System.out.print("phone number updated successfully\n");
			}else{
				System.out.print("phone number not found not found");
			}
	}


}



