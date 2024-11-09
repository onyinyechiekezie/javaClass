import java.util.Scanner;
public class Departments   {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	System.out.print("Please choose a department\n.1.IT\n.2.HR\n.3.Finance\n.");
	int department = input.nextInt();

	switch(department)  {
	case 1:System.out.print("IT");
		System.out.print("1.Manager\n.2.Analyst\n.3.Intern\n.");
		int it = input.nextInt();

		switch(it) {
		case 1:System.out.print("Manager");
			break;
		case 2:System.out.print("Analyst");
			break;		
		case 3:System.out.print("Intern");
			break;
		} break;

	case 2:System.out.print("HR");
		System.out.print("1.Manager\n.2.Analyst\n.3.Intern\n.");
		int hr = input.nextInt();
		
		switch(hr)  {
		case 1:System.out.print("Manager");
			break;
		case 2:System.out.print("Analyst");
			break;		
		case 3:System.out.print("Intern");
			break;
		} break;

	
	case 3:System.out.print("Finance");
		System.out.print("1.Manager\n.2.Analyst\n.3.Intern\n.");
		int finance  = input.nextInt();

		switch(finance)  {
		case 1:System.out.print("Manager");
			break;
		case 2:System.out.print("Analyst");
			break;		
		case 3:System.out.print("Intern");
			break;
		}
	




	}


}
}

