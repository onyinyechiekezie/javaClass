 import java.util.Scanner;
 public class Negative_Positive {
 public static void main(String[] args) {

   Scanner input = new Scanner(System.in);

int number = 0;
String decision = " ";

do  {
 System.out.print("Enter a number: ");
  number = input.nextInt();
if(number < 0) {
  System.out.println(number + " is negative");
}
else if(number > 0)  {
  System.out.println(number + " is positive");
}
else{
System.out.print(number + " is zero");
}


 System.out.print("Do you wish to continue? ");
  decision = input.next();
}
while(decision.equals("yes"));



}
}





      


