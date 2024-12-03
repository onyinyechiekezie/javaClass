import java.util.Arrays;
import java.util.Scanner;
public class StudentGrades  {
	public static void main(String[] args)  {

		Scanner input = new Scanner(System.in);
		int[] scores;
		int[]total;
		int totals = 0;
		int[] numberOfStudent;
		//int[] total = new int[numberOfStudents];
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
				System.out.println();
				totals = totals + score;
				System.out.print(totals);
				scores = new int[score];
			
			//}
		//} 
		for(int i = 0; i < numberOfStudents - 1; i++) {
			numberOfStudent[i] = numberOfStudent[numberOfStudents -1];
			numberOfStudent[numberOfStudents -1] = numberOfStudent[numberOfStudents - 1];
			
		
		printLine();	
		System.out.printf("%s\t\t%s\t%s\t%s\t%s\t%s\t\t%s%n","STUDENT","SUB1","SUB2","SUB3","TOT","AVERAGE","POS");
		printLine();
		//for(int j =0; j<=scores.length;j++)
		System.out.printf("%s\t\t%s%n","Student"+index+"" );
			
		}
		}
		}	
	}	
	public static void printSave(){
		System.out.print("Saving >>>>>>>>>>>>>>>>>>>>>\nSaved successfully\n");
	}
	public static void printLine(){
		System.out.print("==============================================================================\n");
	}

}//student number[index] = input.next
//newi=studentnumber[index]

//int[][]=new int[numberOfstudents][subject]
//int[]total= new int[studentnumber]
//int[] average= new int[numberofstudent]
//for(int count = 1; count <+numbers of student.length; count++)  {
	//System.out.print

