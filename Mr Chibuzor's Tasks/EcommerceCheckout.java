import java.util.Scanner;
public class EcommerceCheckout  {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		
		System.out.print("View products\n>>Parfait : $5.00\n>>Beans : $2.50\n>>Cornflakes : $3.25\n>>Tampons : $4.00\n>>Batteries : $3.50\n>>Diapers : $1.45\n>>Laptops : $3.00\n>>Cards : $7.00\n");


		String[] products = {"Parfait", "Beans", "Cornflakes", "Tampons", "Batteries", "Diapers", "Laptops", "Cards"};
		double[] prices = {5.00, 2.50, 3.25, 4.00, 3.50, 1.45, 3.00, 7.00};
		int[] quantities = {1,2,3,4,5,6,7,8};
		int option = 0;
		int index = 0;
		while(option != 3)  {
		
		System.out.print("1.Add product(s) to cart\n2.View invoice\n3.Exit\n");
		option = input.nextInt();
		switch(option)  {
			case 1:System.out.println("Choose product by index");
			products[index] = input.nextLine();
			prices[index] = input.nextDouble();
			System.out.println("Enter quantity");
			quantities[index] = input.nextInt();
			index++;
				break;
			case 2:viewInVoice(products, prices, quantities, index);
				break;
			case 3:System.out.print("exit");
				break;
			default:System.out.println("Invalid option");
		}
		}

	}
	public static void viewInVoice(String[] products,double[] prices,int[] quantities,int index)  {
		Scanner input = new Scanner(System.in);
		double total = 0;
		double subtotal = 0;
		double discount = 0;
		double billTotal = 0;
		double vat = 0;
		double balance;

		System.out.println("Hello, please enter your name");
		String customerName = input.nextLine();
		System.out.println("How much have u paid:");
		double amtPaid = input.nextDouble();

		System.out.println("SEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
		System.out.println("TEL: 03293828343");
		System.out.println("Date: 2-Dec-24");
		String cashier = "Onyinye";
		System.out.println("Cashier: " + cashier);
		System.out.println("Customer Name: " + customerName);
		System.out.println("========================================================");
		System.out.printf("%s\t%s\t%s\t%s%n", "ITEM", "QTY", "PRICE", "TOTAL");
		System.out.println("---------------------------------------------------------");


		for(int counter = 1; counter <=index; counter++)  {
			double productTotal = prices[counter] * quantities[counter];
			total = total + productTotal;

			System.out.println(products[counter] + "\t" + quantities[counter] + "\t" + prices[counter] + "\t" +  String.format("%.2f", productTotal));
		System.out.println("--------------------------------------------------------");
		subtotal = total;
		discount = subtotal * 0.10;
		vat = subtotal * 0.075;
		billTotal = subtotal - discount + vat;
		System.out.println("Sub Total: "+ subtotal);
		System.out.println("Discount: "+ discount);
		System.out.println("VAT @ 7.5%: "+ vat);
		System.out.println("========================================================");
		balance = amtPaid - billTotal;
		System.out.println("Bill Total: "+ billTotal);
		System.out.println("Amount paid: "+ amtPaid);
		System.out.println("Balance: "+ balance);
		System.out.println("========================================================");
		System.out.println("           THANK YOU FOR YOUR PATRONAGE");
		System.out.println("========================================================");
		}	
	}	
}
		
		
		
