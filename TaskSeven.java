import java.util.Scanner;
public class TaskSeven  {
   public static void main(String[] args)  {

  int sumOne = 0;
  int sumTwo = 0;

  for(int index = 4; index <=1024; index*=4)   {
         sumOne = (index) * 5;
	System.out.printf(" %d", sumOne);


}
  for(int count = 8; count <=32768; count*=8)   {
        sumTwo = (count) * 5;
	System.out.printf(" %d", sumTwo);

}

  
 



}
}