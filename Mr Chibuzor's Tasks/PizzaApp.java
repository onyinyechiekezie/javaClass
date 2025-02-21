import java.util.Scanner;
public class PizzaApp  {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		int option = 0;
		input.nextLine();
		printLine();
		printWelcomeMessage();
		while(option != 5)  {
		System.out.print("Kindly choose an option\n>>1.View PizzaMenu\n>>2.Place order\n>>3.View order details\n>>4.View payment details\n");
		option = input. nextInt();
		switch(option)  {
			case 1: pizzaMenu();
					break;
			case 2: placeOrder(input);
					break;
			//case 3: orderDetails();
					//break;
		}
		}
	}
	public static void printLine()  {
		System.out.println("===================================================================================");
	}

	public static void printWelcomeMessage()  {
		System.out.print("        	          WELCOME TO IYA MOSES PIZZA JOINT\n           (Fun fact: Pizza is a great way to get your daily dose of veggies)\n");
	}
	public static void pizzaMenu()  {
		printLine();
		System.out.printf("%s\t%s\t%s%n%s\t\t%d\t\t%d%n%s\t\t%d\t\t%d%n%s\t\t%d\t\t%d%n%s\t\t\t%d\t\t%d%n", "Pizza type", "Number of slices", "Price per box", "Sapa size", 4, 2500, "Small money", 6, 2900, "Big boys", 8, 4000, "Odogwu", 12, 5200);
		printLine();
	}
	public static void placeOrder(Scanner input)  {
		System.out.print("We're excited to have you!\nPlease take a minute to place your order\n");
		System.out.print("Enter number of guests: ");
		int numberOfGuests = input.nextInt();
		System.out.print("Enter pizza type: ");
		String pizzaType = input.next();		
		if(pizzaType.equals("sapasize"))  {
			int numberOfBox1 = numberOfGuests / 4;
			int price = 2500 * numberOfBox1;
			int pizzaSlices = numberOfGuests;
			int leftover = pizzaSlices - numberOfGuests;
			if(pizzaSlices < numberOfGuest)
				int add = numberOfGuest - (2 * 4);
				int add1 = 			
			System.out.printf("You've purchased %d boxes of pizza at %d naira%nNumber of leftovers are %d%n", numberOfBox1, price, leftover);
		}
		else if(pizzaType.equals("smallmoney"))  {
			int numberOfBox2 = numberOfGuests / 6;
			int price = 2900 * numberOfBox2;
			int pizzaSlices = numberOfGuests;
			int leftover = pizzaSlices - numberOfGuests;		
			System.out.printf("You've purchased %d boxes of pizza at %d naira%nNumber of leftovers are %d%n", numberOfBox2, price, leftover);
		}

		else if(pizzaType.equals("bigboys"))  {
			int numberOfBox3 = numberOfGuests / 8;
			int price = 4000 * numberOfBox3;
			int pizzaSlices = numberOfGuests;
			int leftover = pizzaSlices - numberOfGuests;		
			System.out.printf("You've purchased %d boxes of pizza at %d naira%nNumber of leftovers are %d%n", numberOfBox3, price, leftover);
		}

		else if(pizzaType.equals("odogwu"))  {
			int numberOfBox4 = numberOfGuests / 12;
			int price = 5200 * numberOfBox4;
			int pizzaSlices = numberOfGuests;
			int leftover = pizzaSlices - numberOfGuests;		
			System.out.printf("You've purchased %d boxes of pizza at %d naira%nNumber of leftovers are %d%n", numberOfBox4, price, leftover);
		}



	}


}