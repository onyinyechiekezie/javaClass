import java.util.Scanner;
public class AjegunlePizza{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

  pizzaMenu();
 }
 public static void pizzaMenu(){
Scanner scanner = new Scanner(System.in);
 int guest = 0;
 int sumLess = 1;
 int remainLessSlices = 0;
 int sumPizza = 0;
 int remainSlices =0;
 int price =0;

  System.out.print("""

   WELCOME TO IYA MOSES PIZZA JOINT AJEGUNLE.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
          PIZZA TYPE	 NUMBER OF SLICES	PRICE PER BOX
                        
 	1 Sapa size		4		2,500

        2 Small money		6		2,900

        3 Big boys		8		4,000
	
        4  Odogwu		12		5,200

""");
System.out.print("Pizza type?:");
int type = scanner.nextInt();
System.out.println("=======================================================");
switch(type){
 case 1:
  System.out.print("How many guest do u have?:");
   
   guest = scanner.nextInt();
  System.out.println("=======================================================");
 if(guest <=4){
     System.out.println(sumLess+ " box.");
   
     remainLessSlices = (sumLess * 4) - guest;
    System.out.println("Left over slices after serving = "+remainLessSlices +" Slices"); 

    System.out.println("price: 2,500");
    System.out.print("THANKS FOR PATRONIZING IYA MOSES PIZZA>>>>");

  }
  
   else{
    sumPizza = (  guest / 4 ) + 1;
  System.out.println("Number of boxes of pizza to buy = "+sumPizza+ " boxes.");
  
   remainSlices = (sumPizza * 4) - guest;
  System.out.println("Left over slices after serving = "+remainSlices +" Slices"); 

   price = sumPizza * 2500;
 System.out.println("price: "+ price);
 System.out.print("""
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
THANKS FOR PATRONIZING IYA MOSES PIZZA>>>>
               YOUR 
   SATISFACTION IS OUR PRIORITY >>>>>>     
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
""");
  }
  
  break;

  case 2:
  System.out.print("How many guest do u have?:");
   guest = scanner.nextInt();
   if(guest <=6){
  
    System.out.println(sumLess+ " box.");
   
     remainLessSlices = (sumLess * 6) - guest;
    System.out.println("Left over slices after serving = "+remainLessSlices +" Slices"); 

    System.out.println("price: 2,900");
 System.out.print("""
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
THANKS FOR PATRONIZING IYA MOSES PIZZA>>>>
               YOUR 
   SATISFACTION IS OUR PRIORITY >>>>>>     
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
""");

   }

   else{
    sumPizza = (  guest / 6) + 1;
  System.out.println("Number of boxes of pizza to buy = "+sumPizza+ " boxes.");
  
   remainSlices = (sumPizza * 6) - guest;
  System.out.println("Left over slices after serving = "+remainSlices +" Slices"); 

   price = sumPizza * 2900;
 System.out.println("price: "+ price);
  System.out.print("""
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
THANKS FOR PATRONIZING IYA MOSES PIZZA>>>>
               YOUR 
   SATISFACTION IS OUR PRIORITY >>>>>>     
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
""");


  }
  
  break;
  case 3:
   System.out.print("How many guest do u have?:");
   guest = scanner.nextInt();
   if(guest <=8){
  
    System.out.println(sumLess+ " box.");
   
     remainLessSlices = (sumLess * 8) - guest;
    System.out.println("Left over slices after serving = "+remainLessSlices +" Slices"); 

    System.out.println("price: 4,000");
    System.out.print("""
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
THANKS FOR PATRONIZING IYA MOSES PIZZA>>>>
               YOUR 
   SATISFACTION IS OUR PRIORITY >>>>>>     
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
""");


   }

   else{
    sumPizza = (  guest / 8) + 1;
  System.out.println("Number of boxes of pizza to buy = "+sumPizza+ " boxes.");
  
   remainSlices = (sumPizza * 8) - guest;
  System.out.println("Left over slices after serving = "+remainSlices +" Slices"); 

   price = sumPizza * 4000;
 System.out.println("price: "+ price);
  System.out.print("""
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
THANKS FOR PATRONIZING IYA MOSES PIZZA>>>>
               YOUR 
   SATISFACTION IS OUR PRIORITY >>>>>>     
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
""");


  }
 
 break;
 case 4:
   System.out.print("How many guest do u have?:");
   guest = scanner.nextInt();
   if(guest <=12){
  
    System.out.println(sumLess+ " box.");
   
     remainLessSlices = (sumLess * 12) - guest;
    System.out.println("Left over slices after serving = "+remainLessSlices +" Slices"); 

    System.out.println("price: 5,200");
    System.out.print("""
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
THANKS FOR PATRONIZING IYA MOSES PIZZA>>>>
               YOUR 
   SATISFACTION IS OUR PRIORITY >>>>>>     
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
""");

   }
   else{
    sumPizza = (  guest / 12) + 1;
  System.out.println("Number of boxes of pizza to buy = "+sumPizza+ " boxes.");
  
   remainSlices = (sumPizza * 12) - guest;
  System.out.println("Left over slices after serving = "+remainSlices +" Slices"); 

   price = sumPizza * 5200;
 System.out.println("price: "+ price);
  System.out.print("""
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
THANKS FOR PATRONIZING IYA MOSES PIZZA>>>>
               YOUR 
   SATISFACTION IS OUR PRIORITY >>>>>>     
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
""");
 
   }
  }
 
 }
}