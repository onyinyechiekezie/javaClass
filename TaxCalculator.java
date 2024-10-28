import java.util.Scanner;

public class TaxCalculator  {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int numberOfCitizens=3;
    System.out.print("Enter citizen's name: ");
    String name = input.next();

    System.out.print("Enter citizen's earning: ");
    double earnings = input.nextDouble();

    double taxRate1 = 0.15;
    double taxRate2 = 0.20;

    if(earnings <= 30000)  {
    double less = earnings * taxRate1;
    System.out.println(name + " total tax is " + less);
    } else if(earnings > 30000)  {
    double more = earnings * taxRate2;
    System.out.println(name + " total tax is " + more);
    }



}
}