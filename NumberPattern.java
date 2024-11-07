import java.util.Scanner;

public class  NumberPattern {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number pattern");
	int userInput = input.nextInt();

for(int index =1; index < userInput; index++)  {
	System.out.println();

	for(int counter=1; counter <=index; counter++) { 
 	System.out.print(counter + " ");
	}
}

}
    }






