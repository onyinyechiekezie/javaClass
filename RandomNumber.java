import java.util.Random;
import java.util.Scanner;

public class RandomNumber  {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int random = new Random().nextInt(500);


System.out.println("Guess a number between 1 and 500: ");

while(true)  {
    System.out.print("Enter ur guess: ");
    int guess = input.nextInt();
if(guess < random)  {
   System.out.println("Too low, try again");
}
if(guess > random)  {
    System.out.println("Too high, try again");
    }
 else {
    System.out.println("Congratulations, you guessed the right number" );
}

}
}
}



