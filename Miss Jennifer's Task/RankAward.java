import java.util.Scanner;
public class RankAward   {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	System.out.print("Please enter a rank\n.1.Rank1\n.2Rank2\n.3.Rank3\n.4.Rank4\n.");
	int rank = input.nextInt();

	switch(rank)  {
	case 1: System.out.print("Gold Medal");
		break;
	case 2: System.out.print("Silver Medal");
		break;
	case 3: System.out.print("Bronze Medal");
		break;
	case 4: System.out.print("Participant Ribbon");
		break;
	}



}
}

