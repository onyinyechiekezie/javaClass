import java.util.Scanner;
public class Area  {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

	 

	System.out.print("Choose a shape\n.1.Circle\n.2.Rectangle\n.3.Triangle\n.");
	int choice = input.nextInt();

	switch(choice)  {
	case 1:System.out.print("Circle");
		System.out.print("\n To calculate area of circle, enter\n.1.radius:\n.");
		double raduis = input.nextInt();
		double area = 3.14 * Math.pow(raduis,2); 

		System.out.printf("Area of circle is %.2f: ", area);
			break;


	case 2:System.out.print("Rectangle");
		System.out.print("\n To calculate area of Rectangle, enter\n1. length\n.");
		double length = input.nextInt();
		System.out.print("\n To calculate area of Rectangle, enter\n1. breadth\n.");
		double breadth = input.nextInt();

		area = length * breadth; 

		System.out.printf("Area of rectangle is %.2f: ", area);
			break;


	case 3:System.out.print("Triangle");
		System.out.print("\n To calculate area of triangle, enter\n1.Base\n.");
		double base = input.nextInt();
		System.out.print("\n To calculate area of triangle, enter\n1.height\n.");
		double height = input.nextInt();

		area = (base * height) / 2; 

		System.out.printf("Area of triangle is %.2f: ", area);
			break;

		
	}

}
}
 
