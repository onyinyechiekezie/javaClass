public class DuplicateElement  {
	public static void main(String[] args)  {

	int[] numbers = {1, 2, 3, 1, 2, 4, 5, 3};
	System.out.println("Duplicate values are:");
	for(int index = 0; index < numbers.length - 1; index++)  {
		for(int counter = index + 1; counter< numbers.length; counter++) {
			if(numbers[index] == numbers[counter] && index != counter)  {
				System.out.println("Duplicate elements: " +  numbers[counter]);
			}
		}
	}
	}
}

	