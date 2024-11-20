public class Intersection  {
	public static void main(String[] args)  {

	
	int[] firstList = {1, 2, 3, 4};
	int[] secondList = {3, 4, 5, 6};
	for(int index = 0; index < 4; index++) {
		for(int counter = 0; counter < 4; counter++)  {
			if(firstList[index] == secondList[counter])  {

				System.out.print("Numbers that intersect are: " + firstList[index] + " " );
			}
		}
	}
}
}
