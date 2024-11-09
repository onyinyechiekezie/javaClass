import java.util.Scanner;
public class DesertMenu  {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	System.out.print("Hello esteemed customer, kindly choose a desert type\n.1.Ice cream\n.2.Sundae\n.3.Shake\n.");
	int choice = input.nextInt();

	switch(choice)   {
	case 1:System.out.print("Ice cream");
		System.out.print("\n1.Chocolate\n2.Vanilla\n.3.Strawberry\n.");
		int icecream = input.nextInt();

		switch(icecream)  {
		case 1:System.out.print("Chocolate");
			break;
		case 2:System.out.print("Vanilla");
			break;
		case 3:System.out.print("Strawberry");
			break;
		} break;

	case 2:System.out.print("Sundae");
		System.out.print("\n1.Chocolate\n2.Vanilla\n.3.Strawberry\n.");
		int sundae = input.nextInt();

		switch(sundae)  {
		case 1:System.out.print("Chocolate");
			break;
		case 2:System.out.print("Vanilla");
			break;
		case 3:System.out.print("Strawberry");
			break;
		} break;

	case 3:System.out.print("Shake");
		System.out.print("\n1.Chocolate\n2.Vanilla\n.3.Strawberry\n.");
		int shake = input.nextInt();

		switch(shake)  {
		case 1:System.out.print("Chocolate");
			break;
		case 2:System.out.print("Vanilla");
			break;
		case 3:System.out.print("Strawberry");
			break;
		} break;

	}

}
}



