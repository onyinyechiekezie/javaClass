import java.util.Random;
import java.util.Scanner;
public class RandomNumberLoop  {
   public static void main(String[] args)  {

       Scanner input = new Scanner(System.in);
       int number = 0;
       int random = new Random().nextInt(100);

   System.out.print("Guess a number between 1 and 100");
 do  {
           System.out.print("Guess a number: ");
           number = input.nextInt();
           if(number > random ) {
               System.out.println("Too high, try again.");
           } else if(number < random)  {
               System.out.println("Too low, try again.");
           } else if(number == random) {
               System.out.println("You guessed correctly.");
       }
       }
       while(number != random);


}
}

