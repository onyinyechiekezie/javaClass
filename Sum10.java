import java.util.Scanner;
public class Sum10 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int counter = 0; 
int sum = 0;

while(counter <10) {
System.out.print("Enter a natural number:");
int number = input.nextInt();
if(counter <=10) {
sum = number + counter;
counter++;
}else {
 break;
}
}

System.out.printf("Sum of first 10 natural numbers: %d", sum);

}
}


