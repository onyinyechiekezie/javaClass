import java.util.Scanner;
public class Palindrome {
  public static void main(String[] args) {
  
   Scanner input = new Scanner(System.in);

    System.out.print("Enter a first digit integer:");
    int digit1 = input.nextInt();
    System.out.print("Enter second digit integer:");
    int digit2 = input.nextInt();
    System.out.print("Enter third digit integer:");
    int digit3 = input.nextInt();


if(digit1 == digit3)  {
    System.out.printf("%d is a palindrome", digit1,digit2,digit3);
} else{
    System.out.printf("%03d is not a palindrome", digit1,digit2,digit3);



}
}
}
    

