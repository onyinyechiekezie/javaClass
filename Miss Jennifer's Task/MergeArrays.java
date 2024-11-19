public class MergeArrays  {
	public static void main(String[] args)  {

	int[] numbers1 = {1, 3, 5};
	int[] numbers2 = {2, 4, 6};
	int numbers1length = numbers1.length;
	int numbers2length = numbers2.length;
	int numbers3length = numbers1length + numbers2length;
	int[] numbers3 = new int[numbers3length];
	for(int index = 0; index < numbers1.length; index++)  {
		numbers3[index] = numbers1[index];
	}
	for(int index = 0; index < numbers2.length; index++)  {
		numbers3[numbers1.length + index] = numbers2[index];
	}
	for(int index = 0; index < numbers3length; index++)  {
	System.out.print(numbers3[index] + " ");
	}

}
}

	

	