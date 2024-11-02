import java.util.Scanner;
public class IncreasingDecreasing {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Give me a number: ");
int number1 = input.nextInt();

System.out.print("Give me a number: ");
int number2 = input.nextInt();

System.out.print("Give me a number: ");
int number3 = input.nextInt();

if(number1 < number2 && number2 < number3)  {
System.out.println("Numbers are in ascending order"); 
} 
else if(number3 < number2 && number2 < number1) {
System.out.print("Numbers are in descending order");
}
else {
System.out.println("Numbers are not in order");
}

}
}
