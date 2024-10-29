import java.util.Scanner;

public class LargestSmallestLoop  {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
double largest = Double.NEGATIVE_INFINITY;
double smallest = Double.POSITIVE_INFINITY;
int count = 0;


while(true) {
  System.out.print("Enter a number: ");
  double number = input.nextDouble();
  count++;

if(number == 0)   {
  break;
}


largest = Math.max(largest, number);
smallest = Math.min(smallest, number);

}
if(count > 1)  {
  System.out.println("Largest number is: " + largest);
  System.out.println("Smallest number is: " + smallest);
}

}
}








