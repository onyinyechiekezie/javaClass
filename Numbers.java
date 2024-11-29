import java.util.Scanner;
public class Numbers {
public static void main(String[] args) {

System.out.println("a" + "\t" + "b" + "\t" + "pow(a, b)" );
for (int index = 1; index <=5; index++) {
System.out.printf("%d\t%d\t%.0f\n", index, index + 1, Math.pow(index,  index + 1));

}
}
}   
