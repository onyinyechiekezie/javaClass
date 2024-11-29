import java.util.Scanner;
public class GuessNumber  {
   public static void main(String[] args)  {

       Scanner input = new Scanner(System.in);
       int guessNumber = 20;

       System.out.print("Guess a number: ");
       int number = input.nextInt();

       if(number == guessNumber) {
           System.out.println("You guessed correctly");
       } else {
           System.out.println("Not correct, try again later");
       }










}
}