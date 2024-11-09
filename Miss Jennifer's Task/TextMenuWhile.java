import java.util.Scanner;
public class TextMenuWhile  {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

int sentinel = -1;
int reply;
int counter = 1;
while(counter > 1)  {
	System.out.print("Choose an option\n1)Add\n2)View\n3)Delete\n4)Quit\nYou can choose to terminate by pressing -1\n");
	reply = input.nextInt();

	if(reply == 1) {
		System.out.println("You chose 'Add' ");
	}else if(reply == 2) {
		System.out.println("You chose 'View' ");
	}else if(reply == 3) {
		System.out.println("You chose 'Delete' ");
	}else if(reply == 4) {
		System.out.println("You chose 'Quit' ");
	counter++;
	}

}



}
}



	

