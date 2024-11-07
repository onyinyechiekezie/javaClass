import java.util.Scanner;
public class  Grades {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter grade: ");
	int grade = input.nextInt();
	if(grade < 50) 
		System.out.println("D");
	
	
	else if(grade == 50 || grade <= 60) 
		System.out.println("C");
	
	else if(grade == 61 || grade <= 80) 
		System.out.println("B");
	
	else if(grade > 80 || grade <= 100) 
		System.out.println("A");
	


}
}


