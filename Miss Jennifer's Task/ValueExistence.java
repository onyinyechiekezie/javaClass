import java.util.Scanner;
public class ValueExistence {
	public static void main(String[] args)  {

	Scanner input = new Scanner(System.in);

	int numbers[] = {2, 4, 6, 8, 10};
	System.out.println("Enter a number to check if it exist in the given array list: ");
	int value = input.nextInt();
	for(int index = 0; index < numbers.length; index++)  {
		if(value==numbers[index])  {
			System.out.println("Element found at index " + index);
		}else {
			System.out.println("Element not found");
		}
	}

}
}


	