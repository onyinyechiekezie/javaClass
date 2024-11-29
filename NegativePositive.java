import java.util.Scanner;
 public class NegativePositive {
 public static void main(String[] args) {

   Scanner input = new Scanner(System.in);

int negativeCounter = 0;
int positiveCounter = 0;
int zeroCounter = 0;
int numberCounter = 1;

while(numberCounter <=4) {
 System.out.print("Enter five numbers:");
 int number = input.nextInt();
} 
if(number < 0) {
 negativeCounter ++;
}
else if(number > 0) {
 positiveCounter ++;
}
else{
 zeroCounter ++;
}

 numberCounter +=1;

System.out.printf("Negative numbers are %d%n", negativeCounter);
System.out.printf("Positive numbers are %d%n", positiveCounter);
System.out.printf("Zero numbers are %d%n", zeroCounter);


}
}






   