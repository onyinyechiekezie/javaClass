import java.util.Scanner;
public class LargestSmallestNumbers {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   double number=0;
   double secondNumber = 0;
   String name="";
    
   do {
      System.out.print("Enter a number:");
       number = input.nextDouble();
     System.out.print("Enter a number");
       secondNumber =input.nextDouble();
      System.out.print("Would you like to perform another operation?");
       name = input.next();
       if(number>secondNumber) {
          System.out.println("The largest number is" + number);
       } 
       if(number<secondNumber) {
          System.out.println("The smallest number is" + number);
       } 
       if(secondNumber>number) {
          System.out.println("The largest number is" + secondNumber);
       } 
       if(secondNumber<number) {
          System.out.println("The smallest number is" + secondNumber);
       }    

       } while(name.equals("yes"));

 }
}