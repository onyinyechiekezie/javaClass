import java.util.Arrays;
import java.util.Scanner;
public class StudentGrades  {
	public static void main(String[] args)  {

		Scanner input = new Scanner(System.in);
		int[] scores;
		int[] numberOfStudent;
		System.out.print("How many students do you have?\n");
		int numberOfStudents = input.nextInt();
		System.out.print("How many subjects do they offer?\n");
		int numberOfSubjects = input.nextInt();
		numberOfStudent = new int[numberOfStudents];
		printSave();
	 	

		for(int index = 1; index<=numberOfStudents; index++){
			for(int count = 1; count <=numberOfSubjects; count++){
				System.out.print("Entering Score For Student"+index+"\nEnter score for subject"+count+"\n");
				int score = input.nextInt();
				printSave();
				score = score + index;
				scores = new int[score];
			
			}
		} 
		for(int index = 1; index <=numberOfStudents.length; index++) {
			numberOfStudent[index] = numberOfStudents[index];
		}
		printLine();	
		System.out.printf("%s\t\t%s\t%s\t%s\t%s\t%s\t\t%s%n","STUDENT","SUB1","SUB2","SUB3","TOT","AVERAGE","POS");
		printLine();
		System.out.printf("%s","Student",numberOfStudent[0] );
			
	}	
	public static void printSave(){
		System.out.print("Saving >>>>>>>>>>>>>>>>>>>>>\nSaved successfully\n");
	}
	public static void printLine(){
		System.out.print("========================================================\n");
	}

}