import java.util.Scanner;
public class LateReturn1 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a date to return book: ");
int date = input.nextInt();

if(date <=5) {
   System.out.print("Fine is 50 paise");
}else if(date <=10) {
   System.out.print("Fine is one rupee");
}else if(date <=30)  {
   System.out.print("Fine is 5 rupees");
}else if(date >30)  {
   System.out.print("Your membership has been cancelled");
}


}
} 

   
   
   


