import java.util.Scanner;
public class ForLoop   {
public static void main(String[] args)   {

   Scanner input = new Scanner(System.in);
   int corectValue = 2;
   int userInput = 0;

   for(int counter = 1; counter <=3; counter++)  {
       System.out.print("Give me a number: ");
       userInput = input.nextInt();
   
    if(userInput == 2) {
       System.out.println("input is correct");
    }
    else{
       System.out.println("Input is incorrect"+ " please do better nex time");
	
    }
}


}



}

