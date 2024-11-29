public class MaximumElement  {
	public static void main(String[] args) {

	int[] numbers = {10, 20, 30, 40 , 5, 1};
	int maximum =  0;
	for(int index = 0; index < numbers.length; index++)  {
		if(numbers[index] > maximum)  {
			maximum = numbers[index];
		}
	}
	System.out.println("Maximum element is: " + maximum);
}
}
