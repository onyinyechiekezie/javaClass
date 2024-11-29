import java.util.Scanner;
public class  GradesSwitch {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

System.out.print("Choose a grade\n1.1 to 50\n2.51 to 70\n3.71 to 100\n ");
int grade = input.nextInt();
switch(grade) {
case 1: System.out.println("C");
	break;
case 2: System.out.println("B");
	break;
case 3: System.out.println("A");
	break;

}
}
}



