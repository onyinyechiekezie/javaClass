public class SumArray   {
	public static void main (String[] args)  {

		int[] numbers = {1, 2, 3, 4, 5};
		int sum = 0;

		for(int counter = 0; counter < numbers.length; counter++)  {
			sum = sum + numbers[counter];
		}
	
		System.out.printf("Sum of array elements are %d%n", sum);


}
}