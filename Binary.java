import java.util.Scanner;
public class Binary {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

int binary = number / 2;
int binary1 = number % 2;
int binary2 = binary / 2;
int binary3 = binary % 2;
int binary4 = binary2 / 2; 
int binary5 = binary2 % 2;
int binary6 = binary4 / 2;
int binary7 = binary4 % 2;

System.out.println(binary7); 
System.out.println(binary5); 
System.out.println(binary3); 
System.out.println(binary1);


}
}

 