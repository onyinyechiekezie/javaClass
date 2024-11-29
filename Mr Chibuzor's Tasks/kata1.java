public class Kata1  {
	public static void main(String[] args)  {
		int[] numbers = {8,2,3,5,10,2,1}; 
		int largestNumber = largest(numbers);
		System.out.printf("Largest is %d%n", largestNumber);
		int reversedElements = reverseArray(numbers);
		System.out.println(reversedElements);

		System.out.println("Enter a number to check if it exist in the given array list: ");
		int value = input.nextInt();
		System.out.println(value);
 
	}
	public static int largest(int[] numbers)  {

		int largest = numbers[0];
		for(int index = 0; index < numbers.length; index++)  {
			if(numbers[index] > largest)
				largest = numbers[index];
		}
		return largest;
	}		
	public static int reverseArray(int[] numbers)  {
		int reverse = new int[numbers.length];
		int index = 0;
		for(int counter = numbers.length - 1; counter >= 0; counter--) {
			reverse = numbers[counter];
		index++;
		}
		return reverse;
		
	}
	public static int checkElement(int[] numbers)  {
		int value = input.nextInt();

		for(int index = 0; index < numbers.length; index++)  {
			if(value==numbers[index])  
				checkElement = value;
		}
	return checkElement;
	}
}

	

	