import java.util.Scanner;
public class EvenOdd   {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
int number = input.nextInt();

if(number%2==0)  {
System.out.print("1");
}
if(number%2!=0) {
System.out.print("0");
}


}
}




