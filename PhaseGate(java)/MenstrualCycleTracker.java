import java.util.Scanner;
public class MenstrualCycleTracker  {
	public static void main(String[] args)  {

		Scanner input = new Scanner(System.in);
		int option = 0;
		input.nextLine();
		System.out.println("         			MENSTRUAL CYCLE TRACKER\n          (You Are Strong And Capable. Believe in yourself And Your Body)");
		System.out.println("===============================================================================================");
		System.out.print("* Welcome To Ovira! *\n*********************************************\nOvira is your personal menstrual companion,\nWe're here to support you every step of the way.\n***********************************************\n");
		while(option != 3) {
		System.out.print("Kindly choose an option\n>>1.Track Menstrual Cycle\n>>2.Pregnancy And Conception\n3.>>Exit\n");
		option = input.nextInt();
		switch(option)  {
			case 1: menstrualCycleTracker(input);
					break;
			case 2: pregnancyAndConception(input);
					break;
			case 3: System.out.print("Read expert advice from healthcare professionals, nutritionists, and fitness experts.\nGet reliable and trustworthy information to support your menstrual health.\nGoodbye friend, hope to see u soon!");
					break;
			default:System.out.println("Invalid option");
					break; 
			
		}
		}


