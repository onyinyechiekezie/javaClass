import java.util.Scanner;
public class Greeting    {
   public static void main(String[] args)   {
   Scanner input = new Scanner(System.in);

   System.out.print("""
   Can i greet?
   Please choose one option:
   1.English
   2.Yoruba
   3.Igbo 
   """);
   int answer = input.nextInt();
   switch(answer)  {

      case 1:
      System.out.println("Hello there!");
      break;
      case 2:
      System.out.println("Ekaro!");
      break;
      case 3:
      System.out.println("Ututu oma!");
      break;

}
}
}

