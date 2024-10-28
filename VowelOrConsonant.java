import java.util.Scanner;

public class VowelOrConsonant  {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter an alphabet: ");
    String input = input.nextLine();
    
    if(input.length() !=1)  {
      System.out.println("Error. Input should be a single alphabet" );
    }else if(input != ("[a-zA-Z]")) {
      System.out.println("Error. Input should be a letter" );
    }else {
     char letter = input.charAt(); 
    if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
      System.out.println(input + "is a vowel");
    }else{
      System.out.println(input + "is a consonant");
    }


}
}
}