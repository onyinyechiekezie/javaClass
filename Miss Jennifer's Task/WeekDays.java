import java.util.Scanner;
public class WeekDays  {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	System.out.print("Pls choose a day of the week\n.1.Sunday\n.2.Monday\n.3.Tuesday\n.4.Wednesday\n.5.Thursday\n.6.Friday\n.7.Saturday\n.");
	int choice = input.nextInt();

	switch(choice)  {
	case 1: System.out.print("It's Sunday babbyyy!");
		break;
	case 2: System.out.print("Monday!");
		break;
	case 3: System.out.print("Tuesday!");
		break;
	case 4: System.out.print("Wednesday!");
		break;
	case 5: System.out.print("Thursday!");
		break;
	case 6: System.out.print("Thank God it's Friday!");
		break;
	case 7: System.out.print("Saturday!");
		break;
	}



}
}