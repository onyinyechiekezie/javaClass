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


	}
	public static void menstrualCycleTracker(Scanner input)  {
		System.out.print("Enter your last menstrual period start date. (day only) e.g '04': ");
		int firstDay = input.nextInt();
		System.out.print("Enter your last menstrual period end date. (day only) e.g '09': ");
		int lastDay = input.nextInt();
		System.out.print("Enter the date of the first day of your next menstrual period. (day only) e.g '01': ");
		int nextPeriod = input.nextInt();

		int duration = lastDay - firstDay;
		int flowEndDate = 1 + duration;
		int length = firstDay - nextPeriod;
		int menstrualCycleLength = 30 - length;
		int ovulationDay = menstrualCycleLength - 14;
		int firstDayOfSafePeriod = ovulationDay + 3;
		int lastDayOfSafePeriod = lastDay - 1;
		int startOfFertileWindow = ovulationDay - 5;
		int endOfFertileWindow = ovulationDay + 1;

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.print(">>Duration of last menstrual period is " + duration + " days\n");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.print(">>Your flow end date is " + flowEndDate + " days\n");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.print(">>Your menstrual cycle length is " + menstrualCycleLength + " days\n>>Keep in mind that this is just an estimate and your actual menstrual cycle length may vary.\n");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.print(">>Your safe period starts from the " + firstDayOfSafePeriod + "th day of your cycle and ends " + lastDayOfSafePeriod + "th day of your cycle\n");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.print(">>Your ovulation day is " + ovulationDay + "th day of your cycle\n");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.print(">>Your fertile window starts from " + startOfFertileWindow + "th day of your cycle and ends on the " + endOfFertileWindow + "th day of your cycle\n");
		input.nextLine();
	}
	public static void pregnancyAndConception(Scanner input)  {
		System.out.print("Which would you like to know first\nChoose an option\n>>1.Conception Date\n>>2.Pregancy Date\n>>3.Press 3 to exit\n");
		int decision = input.nextInt();
		while(decision == 1) {
			System.out.print("Enter your last menstrual period start date. (day only) e.g '04': \n");
			int firstDay = input.nextInt();
			System.out.print("Enter your next menstrual period start date. (day only) e.g '01': \n");
			int nextPeriod = input.nextInt();
			int length = firstDay - nextPeriod;
			int menstrualCycleLength = 30 - length;
			int ovulationDay = menstrualCycleLength - 14;

			System.out.println("Assume conception occurs within 24 hours of ovulation.Your conception date is " + ovulationDay + "(+/-)1 day. i.e " + ovulationDay + "(+1) or " + ovulationDay + "(-1) of your cycle" );
			break;
		}
		while(decision == 2)  {
			System.out.print("Enter your last menstrual period start date. (day only) e.g '04': \n");
			int firstDay = input.nextInt();
			System.out.print("Enter your next menstrual period start date. (day only) e.g '01': \n");
			int nextPeriod = input.nextInt();
			int length = firstDay - nextPeriod;
			int menstrualCycleLength = 30 - length;
			int ovulationDay = menstrualCycleLength - 14;
			int pregnancyDate = ovulationDay + 266;
			System.out.println("Your estimated pregnancy due date(EDD) is " + pregnancyDate + " days");
			break;
		}
		
	}

 
}