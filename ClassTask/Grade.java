import java.util.Scanner;
public class Grade {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);
	int counter = 1;
	while(counter <=30)  {
		System.out.println("Please enter your grade for Math: ");
	int grade = input.nextInt();
		System.out.println("Please enter your grade for English: ");
	int grade1 = input.nextInt();
		System.out.println("Please enter your grade for Chemistry: ");
	int grade2 = input.nextInt();
		System.out.println("Please enter your grade for Biology: ");
	int grade3 = input.nextInt();
		System.out.println("Please enter your grade for Physics: ");
	int grade4 = input.nextInt();

		if(grade >= 50)
			System.out.print("You passed Math\n");
		else
			System.out.print("You failed Math\n");
		if(grade1 >= 50)
			System.out.print("You passed English\n");
		else
			System.out.print("You failed English\n");
		if(grade2 >= 50)
			System.out.print("You passed Chemistry\n");
		else
			System.out.print("You failed Chemistry\n");
		if(grade3 >= 50)
			System.out.print("You passed Biology\n");
		else
			System.out.print("You failed Biology\n");
		if(grade4 >= 50)
			System.out.print("You passed Physics\n");
		else
			System.out.print("You failed Physics\n");

	}

}
}
	