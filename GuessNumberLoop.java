import java.util.Scanner;
public class GuessNumberLoop  {
   public static void main(String[] args)  {

       Scanner input = new Scanner(System.in);
       int guessNumber = 20;
       int number = 0;

       do  {
           System.out.print("Guess a number: ");
           number = input.nextInt();
           if(number > 25) {
               System.out.println("Too high, try again.");
           } else if(number < 15)  {
               System.out.println("Too low, try again.");
           } else if(number == guessNumber) {
               System.out.println("You guessed correctly.");
       }
       }
       while(number != guessNumber);


}
}
           

