import java.util.Scanner;
public class DiaryApp {
	public static String[] entries = new String[50];
	public static String[] id = new String[50]; 
	public static String username;
	public static String password;
	public static boolean isDiaryUser;
	public static boolean isDiaryLocked;
	public static int count;

	public static void main(String[] args)  {

		Scanner input = new Scanner(System.in);

		int option = 0;
		printDesign();
		System.out.printf("\t\t\t%s%n", "DIARY APP");
		printDesign();
		while(option != 9) {
		System.out.print("Kindly choose an option\n1Create Diary User\n2.Lock diary\n3.Unlock diary\n4.Add entry\n5.Find entry by id\n6.Delete entry\n7.Update entry\n8.View entry\n9.Exit\n");
		option = input.nextInt();
		switch(option)  {
			case 1: createDiaryUser();
					break;
			case 2: lockDiary();
					break;
			case 3: unlockDiary();
					break;
			case 4: addEntry();
					break;
			case 5: findEntryById();
					break;
			case 6: deleteEntry();
					break;
			case 7: updateEntry();
					break;
			case 8: viewEntry();
					break;
			case 9: System.out.print("Exit");
					break;
			
		}
		}
	}
	
	public static void printDesign()  {
		System.out.println("````````````````````````````````````````````````````````````````````````````");
	}

	public static void printNewLine()  {
		System.out.println();
	}
	
	public static void createDiaryUser()  {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your username\n");
		username = input.nextLine();
		System.out.print("Enter your password\n");
		password = input.nextLine();
		System.out.print("Confirm password\n");
		String confirmPassword = input.nextLine();
		if(password.equals(confirmPassword)) { 
			System.out.print("Diary user has been created successfully\n");
			isDiaryUser = true;
			}else{
				System.out.print("Password confirmation error! Please try again.\n");
			}
		printNewLine();
	}

	public static void lockDiary() {
		if(isDiaryLocked == false) {
			isDiaryLocked = true;
			System.out.print("Diary has been locked successfully\n");
		}else{
			System.out.print("Create Diary user first!\n");
		}
		printNewLine();
	}

	public static void unlockDiary() {
		Scanner input = new Scanner(System.in);
			
		 if(isDiaryLocked) {		
			System.out.print("Enter username\n");
			String enteredUsername = input.next();
			System.out.print("Enter password\n");
			String enteredPassword = input.next();
			if(enteredUsername.equals(username) && (enteredPassword.equals(password))) {
				isDiaryLocked = false;
				System.out.print("Diary has been unlocked successfully\n");
				addEntry();
			}else{		
				System.out.print("Invalid username or password\n");
			}
		}else{
				System.out.print("Diary was never locked\n");
		}
		printNewLine();
	}

	
	public static void addEntry() {
		Scanner input = new Scanner(System.in);
		if(!isDiaryLocked == false) {
			System.out.print("Cannot perform action. Either diary user has not been created or diary is locked\n");
		}else if(count < entries.length - 1){
			System.out.print("Enter entry number. e.g 1, 2, 3\n");
			id[count] = input.nextLine();
			System.out.print("Add your entry\n");
			entries[count] = input.nextLine();
			count++;
			System.out.print("Entry added successfully\n");
		}
		printNewLine();
	}

	public static void findEntryById() {
		Scanner input = new Scanner(System.in);
		System.out.print("What's your entry number?");
		String entryNumber = input.nextLine();
		for(int index = 0; index < count; index++){
			if(id[index].equals(entryNumber)){
				System.out.print("Entry ID:" +ss "\n" + id[index] + "\n");
				System.out.print("Entry:" + "\n" + entries[index] + "\n");
			}else{
				System.out.print("Entry not found");
			}
		}
		printNewLine();
	}
	public static void deleteEntry() {
		Scanner input = new Scanner(System.in);
		System.out.print("What's your entry number?");
		int entrynumber = input.nextInt();
		for(int index = entrynumber; index < count - 1; index++){
			id[index] = id[index + 1];
			entries[index] = entries[index + 1]; 
		}
		count--;
		System.out.print("Entry deleted successfully\n");
		printNewLine();
	}

	public static void updateEntry(){
		Scanner input = new Scanner(System.in);
		System.out.print("What's your entry number?");
		String entrynumber = input.next();

		for(int index = 0; index < entries.length; index++){
			if(id[index].equals(entrynumber)){
				System.out.print("Enter new content");
				String newContent = input.next();
				entries[index] = newContent;
				break;
			}else{
				System.out.print("Entry not found");
			}
		}
			if(entries.length > 0) {
				System.out.print("Entry updated successfully\n");
			}else{
				System.out.print("Entry not found");
			}
		printNewLine();
	}

	public static void viewEntry() {
		if(count == 0) {
			System.out.print("No entries yet\n");
		}else{
			for(int index = 0; index < count; index++) {
				System.out.print("Entry" + (index + 1) + ":" + entries[index] + "\n");
			}
		}
		printNewLine();
	}
			

	

}	