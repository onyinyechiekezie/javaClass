/** A program that calculates the sum of digits in an integer and displays the sum */
import java.util.Scanner; /* program uses class Scanner  
public class DigitSum {
 public static void main(String[] args) { // main method begins execution of java application

  Scanner input = new Scanner(System.in); // create a Scanner to obtain input from the command window
   System.out.print("Enter integer between 0 and 1000:"); //prompt user
   int integer = input.nextInt(); //read number from user

   int firstDigit = (integer / 100); 
   int secondDigit = (integer / 10) % 10; 
   int thirdDigit = (integer % 10);
    
   int sum = firstDigit + secondDigit + thirdDigit; // calculate in sum

   System.out.println("Sum of each digits are:" + sum); // display sum



} // end method main
} // end class DigitSum
    

   
