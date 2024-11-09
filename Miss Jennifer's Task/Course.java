import java.util.Scanner;
public class Course  {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	System.out.print("Pls choose a course\n.1.Math\n.2.Science\n.3.History\n");
	int course = input.nextInt();

	switch(course)  {
	case 1:System.out.print("Math");
		System.out.print("\n1.Freshman\n.2.Sophomore\n.3.Senior\n.");
		int math = input.nextInt();
		
		switch(math)  {
		case 1:System.out.print("Freshman");
			break;
		case 2:System.out.print("Sophomore");
			break;
		case 3:System.out.print("Senior");
			break;
		} break;


	case 2:System.out.print("Science");
		System.out.print("\n1.Freshman\n.2.Sophomore\n.3.Senior\n.");
		int science = input.nextInt();
		
		switch(science)  {
		case 1:System.out.print("Freshman");
			break;
		case 2:System.out.print("Sophomore");
			break;
		case 3:System.out.print("Senior");
			break;
		} break;

	case 3:System.out.print("History");
		System.out.print("\n1.Freshman\n.2.Sophomore\n.3.Senior\n.");
		int history = input.nextInt();
		
		switch(history)  {
		case 1:System.out.print("Freshman");
			break;
		case 2:System.out.print("Sophomore");
			break;
		case 3:System.out.print("Senior");
			break;
		} break;

	}


}
}
