import java.util.Scanner;
public class NumberEqual {
public static void main(String[] args)  {

Scanner input = new Scanner(System.in);

System.out.print("Give me a number: ");
int number = input.nextInt();

if(number == 2)  {
  System.out.print("Number is correct");
} else {
  System.out.print("Number is wrong");


}
}
}