import java.util.Scanner;
 public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

   for(int index = 1; index <= 9; index++) {
      for(int number = 1; number <= 9; number++)
  
      System.out.print(number+ "*" +index+ "=" +index*number+ "\t");
      System.out.println();

}
}
}