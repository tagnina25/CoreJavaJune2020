

import java.util.Scanner;
import java.text.DecimalFormat;

public class GroceryStorePurchase {
	private static DecimalFormat df2 = new DecimalFormat(".##");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Welcome to my store!");
		System.out.println("The menu is below:");
		
		double banana = 0.95 ;
		double apple = 1.95;
		double chips = 2.55;
		double peach = 1.05;
		double granola = 2.05;
		double totalCost;
		
		System.out.println("1. Bananas $" + banana);
		System.out.println("2. Apples $" + apple);
		System.out.println("3. Chips $" + chips);
		System.out.println("4. Peaches $" + peach);
		System.out.println("5. Granolas $" + granola);
		
		System.out.println("Enter the number of each item you would like to purchase separated by spaces");
		
		Double item1 = keyboard.nextDouble();
		Double item2 = keyboard.nextDouble();
		Double item3 = keyboard.nextDouble();
		Double item4 = keyboard.nextDouble();
		Double item5 = keyboard.nextDouble();
		
		totalCost = ((item1 * banana) + (item2 * apple) + (item3 * chips) + (item4 * peach) + (item5 * granola));
		
		System.out.println("Total owed before tax is: $" + totalCost);
		
		System.out.println("Total owed after tax is: $" + totalCost * 1.07);
		
		double roundOff = (double) Math.round(totalCost * 100) / 100;
		
		
		
		
		
		
		

	}

}
