import java.util.Scanner;
public class TextMenuDoWhile  {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);


do  {
	
	System.out.print("Choose an option\n1)Add\n2)View\n3)Delete\n4)Quit\n");
	reply = input.nextInt();

	if(reply == 1) {
		System.out.println("You chose 'Add' ");
	}else if(reply == 2) {
		System.out.println("You chose 'View' ");
	}else if(reply == 3) {
		System.out.println("You chose 'Delete' ");
	}else if(reply == 4) {
		System.out.println("You chose 'Quit' ");
	}
	System.out.print("Would you like to continue? Yes or No: ");
	String reply = input.next();

}
while(reply.equals("yes"));



}
} 