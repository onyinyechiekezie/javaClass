import java.util.Scanner;
public class  GradesSentinel {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int counter = 1;
	int sentinel=-1;
	int grade = 0;
	while(grade != sentinel) { 
	System.out.print("Enter grade( or -1 to end): ");
	grade = input.nextInt();
	counter++;

	if(grade < 50) 
		System.out.println("D");
	
	
	else if(grade <= 60) 
		System.out.println("C");
	
	else if(grade > 60 || grade <= 80) 
		System.out.println("B");
	
	else if(grade > 80) 
		System.out.println("A");
	
}

}
}
 

