import java.util.Scanner;
public class Mortgage {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter principal amount: ");
double principalAmount = input.nextDouble();
System.out.print("Enter annual interest rate: ");
double annualInterestRate = input.nextDouble();
System.out.print("Enter duration of mortgage in years: ");
double duration = input.nextDouble();

double monthlyInterest=(annualInterestRate/100)/12;
double numberOfPayments=duration*12;
double monthlyPayment=principalAmount*monthlyInterest*(1+monthlyInterest)*numberOfPayments*numberOfPayments/((1+monthlyInterest)*numberOfPayments*numberOfPayments-1);

System.out.print("Your monthly payment is: " + monthlyPayment);


}
}




