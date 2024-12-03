import java.util.Arrays;
import java.util.Scanner;
public class StudentGrades  {
	public static void main(String[] args)  {

		Scanner input = new Scanner(System.in);

		System.out.print("How many students do you have?:");
		int[] numberOfStudents = input.nextInt();
		System.out.print("How many subjects do they offer?:");
		int[] numberOfSubjects = input.nextInt();
		int[] numberOfStudents = new int[numberOfStudents];
		int[] numberOfSubjects = new int[numberOfSubjects];
	 

		for(int index = 1; index<=numberOfStudents; index++){
			for(int count = 1; count <=numberOfSubjects; count++){
				System.out.print("Entering Score For Student"+index+"\nEnter score for subject"+count+" :");
				int score = input.nextInt();
			}
		}

	}

}