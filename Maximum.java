import java.util.Scanner;
public class Maximum  {
   public static void main(String[] args)  {

     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter a number: ");
     int number1 = input.nextInt();
     System.out.print("Enter a second number: ");
     int number2 = input.nextInt();
     System.out.print("Enter a third number: ");
     int number3 = input.nextInt();
      
     

if(number1 > number2 && number1 > number3) {
 System.out.println(number1 + " is the maximum");
}else if(number1<number2 && number1<number3) {
 System.out.println(number1 + " is the minimum");
}
if(number2 > number1 && number2 > number3)  {
 System.out.println(number2 + " is the maximum");
}else if(number2<number1 && number2<number3) {
 System.out.println(number2 + " is the minimum");
}
if(number3 > number1 && number3 > number2)  {
 System.out.println(number3 + " is the maximum");
}else if(number3<number1 && number3<number2) {
 System.out.println(number3 + " is the minimum");



}
}
}
