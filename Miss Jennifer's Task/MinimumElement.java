public class MinimumElement  {
	public static void main(String[] args) {

	int[] numbers = {10, 20, 30, 40 , 5, 1};
	int minimum = numbers[0];
	for(int index = 0; index < numbers.length; index++)  {
		if(numbers[index] < minimum)  {
			minimum = numbers[index];
		}
	}
	System.out.println("Minimum element is: " + minimum);
}
}
