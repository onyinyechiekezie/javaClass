import java.util.Scanner;
public class TextMenuDoWhile  {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);


do  {
	
	System.out.print("Choose an option\na)Add\nb)View\nc)Delete\nd)Quit\n");
	reply = input.nextInt();

	if(reply == a) {
		System.out.println("You chose 'Add' ");
	}else if(reply == b) {
		System.out.println("You chose 'View' ");
	}else if(reply == c) {
		System.out.println("You chose 'Delete' ");
	}else if(reply == d) {
		System.out.println("You chose 'Quit' ");
	}
	System.out.print("Would you like to continue? Yes or No: ");
	String reply = input.next();

}
while(reply.equals("yes"));



}
} 