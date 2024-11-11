import java.util.Scanner;
public class TextMenuWhile  {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

int reply = 0;
int counter = 1;
while(reply != 4)  {
	System.out.print("Choose an option\n1)Add\n2)View\n3)Delete\n4)Quit\n");
	reply = input.nextInt();
	counter++;

	if(reply == 1) {
		System.out.println("You chose 'Add' ");
	}else if(reply == 2) {
		System.out.println("You chose 'View' ");
	}else if(reply == 3) {
		System.out.println("You chose 'Delete' ");
	}else if(reply == 4) {
		System.out.println("You chose 'Quit' ");
	}

}



}
}



	

