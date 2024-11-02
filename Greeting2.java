import java.util.Scanner;
public class Greeting2    {
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
      System.out.print("""
      1.Morning
      2.Afternoon
      3.Evening
      """);
      int english = input.nextInt();

      switch(english) {

      case 1:
      System.out.println("Good morning");
      break;
      case 2:
      System.out.println("Good afternoon");
      break;
      case 3:
      System.out.println("Good evening");
      break;
      }
      break;

      case 2:
      System.out.print("""
      1.Morning
      2.Afternoon
      3.Evening
      """);
      int yoruba = input.nextInt();
      
      switch(yoruba)  {

      case 1:
      System.out.print("Ekaro");
      break;
      case 2:
      System.out.println("Ekaso");
      break;
      case 3:
      System.out.println("Ekuele");
      break;
      }
      break;

      case 3:
      System.out.println("""
      1.Morning
      2.Afternoon
      3.Evening
      """);
      int igbo = input.nextInt();

      switch(igbo)  {
      case 1:
      System.out.println("Ututu oma");
      break;
      case 2:
      System.out.println("Ehihe oma");
      break;
      case 3:
      System.out.println("Abali oma");
      break;
      }
      break;
  
}
}
}



