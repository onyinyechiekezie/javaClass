import java.util.Scanner;

public class VowelOrConsonant  {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    while(true)  {
    System.out.print("Enter an alphabet: ");
    String alphabet = input.nextLine();
    
    if(alphabet.length() !=1)  {
      System.out.println("Error. input should be a single alphabet" );
    }else if(!alphabet.equals("a") && !alphabet.equals("b") && !alphabet.equals("c") && !alphabet.equals("d") && !alphabet.equals("e") && !alphabet.equals("f") && !alphabet.equals("g") && !alphabet.equals("h") && !alphabet.equals("i") && !alphabet.equals("j") && !alphabet.equals("k") && !alphabet.equals("l") && !alphabet.equals("m") && !alphabet.equals("n") && !alphabet.equals("o") && !alphabet.equals("p") && !alphabet.equals("q") && !alphabet.equals("r") && !alphabet.equals("s") && !alphabet.equals("t") && !alphabet.equals("u") && !alphabet.equals("v") && !alphabet.equals("w") && !alphabet.equals("x") && !alphabet.equals("y") && !alphabet.equals("z")) {
      System.out.println("Error. input should be a letter" );
    }else {
     char letter = alphabet.charAt(0); 
    if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
      System.out.println(alphabet + " is a vowel");
    }else{
      System.out.println(alphabet + " is a consonant");
    }


}
}
}
}