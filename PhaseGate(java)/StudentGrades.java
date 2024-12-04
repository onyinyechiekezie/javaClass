import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many students do you have?\n");
        int numberOfStudents = input.nextInt();
        System.out.print("How many subjects do they offer?\n");
        int numberOfSubjects = input.nextInt();
        printSave();

        int[][] scores = new int[numberOfStudents][numberOfSubjects];
        int[] total = new int[numberOfStudents];
        double[] average = new double[numberOfStudents];

        for (int index = 0; index < scores.length; index++) {
            System.out.println("Entering scores for student " + (index + 1));
            for (int counter = 0; counter < scores[index].length; counter++) {
                System.out.println("Enter score for subject " + (counter + 1) + ":");
                scores[index][counter] = input.nextInt();
                printSave();
            } 
        }

        for (int index = 0; index < scores.length; index++) {
            int sum = 0;
            for (int counter = 0; counter < scores[index].length; counter++) {
                sum += scores[index][counter];
            }
            total[index] = sum;
            average[index] = (double) sum / numberOfSubjects;
        }

     

        printLine();
        System.out.printf("%9s", "STUDENT");
        for (int index = 1; index <= numberOfSubjects; index++) {
            System.out.printf("\t%s", "SUB" + index);
        }
        System.out.printf("\t%s\t%s\t%s%n", "TOTAL", "AVERAGE", "POSITION");
        printLine();

        for (int index = 0; index < scores.length; index++) {
            System.out.printf("%9s", "Student " + (index + 1));
            for (int counter = 0; counter < scores[index].length; counter++) {
                System.out.printf("\t%d", scores[index][counter]);
            }
            System.out.printf("\t%d\t%.2f%n", total[index], average[index]);
        }

        printLine();
    }

    public static void printLine() {
        System.out.print("==========================================================================\n");
    }

    public static void printSave() {
        System.out.print("Saving >>>>>>>>>>>>>>>>>>>\nSaved successfully\n");
    }
}
