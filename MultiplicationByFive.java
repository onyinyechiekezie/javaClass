import java.util.Scanner;

public class MultiplicationByFive {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of terms: ");
    int number = input.nextInt();

    for(int index = 0; index <= number; index++) {
	System.out.printf("%d*%d=%d%n", number, index, number*index);


}
}
}



   