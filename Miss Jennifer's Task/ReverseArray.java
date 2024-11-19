public class ReverseArray  {
	public static void main(String[] args)  {

	int numbers[] = {1, 2, 3, 4, 5};
	for(int index = 0; index < numbers.length; index++)  {
	System.out.println(numbers[index]);
	}
	System.out.println("The reverse is");
	for(int counter = numbers.length - 1; counter >= 0; counter--)  {
	System.out.println(numbers[counter]);
	}
}
} 	