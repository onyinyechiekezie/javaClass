import java.util.Scanner;

public class FloatingPointNumbers  {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter first floating point number: ");
    double number1 = input.nextDouble();
    System.out.print("Enter second floating point number: ");
    double number2 = input.nextDouble();
    
    double floatingPoint1 = number1 * 1000;
    double floatingPoint2 = number2 * 1000;

    double floatingPoint_1 = Math.round(floatingPoint1);
    double floatingPoint_2 = Math.round(floatingPoint2);

    if(floatingPoint_1 == floatingPoint_2)  {
       System.out.print("Numbers are the same");
}else{
       System.out.print("Numbers are different");




}
}
 } 
    



