import java.util.Scanner;
public class  TwoLargest {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

      int counter = 1;
      int largest = 0;
      int secondLargest = 0;
      int userInput = 0;

      while(counter <= 10)  {
          System.out.print("Give me number "+counter+" of units sold: ");
          userInput = input.nextInt();
          counter++;

      if(userInput > largest)  {
         largest = userInput;
      }

      if(userInput < secondLargest && secondLargest < largest)   {
         secondLargest = userInput;
      }

   }

    System.out.println("Largest" + largest);
    System.out.println("Second largest" + secondLargest);


}
}
