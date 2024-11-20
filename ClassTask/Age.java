import java.util.Scanner;
public class Age {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);
	for(int index = 1; index <= 20; index++)  {

		System.out.print("How old are you? Pls choose an option\n1.50\n2.20\n3.10 ");
		int age = input.nextInt();
		switch(age)  {
		case 1: System.out.println("You're matured");
			break;
		case 2: System.out.println("You're a teenager");
			break;
		case 3: System.out.println("You're a child");
			break;
		}
		
		if(age != 50 || age != 20 || age != 10)
			System.out.println("Pls state your age");
	}

}
}

