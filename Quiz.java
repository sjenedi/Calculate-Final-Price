/**
 * @author Sami Jenedi
 * This class determines the final price of an item by applying any applicable discounts and sales tax.
 */

import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    
	    final double SALES_TAX_RATE = 0.09;
	    final double DISCOUNT_RATE10 = 0.10;
	    final double DISCOUNT_RATE5 = 0.05;
	    double totalDiscount = 0.0;
	    double enteredPrice = 0.0;
	    double finalPrice = 0.0;
	    
	    //Get price from user
	    System.out.print("Please enter the price of the item:$ "); 
	    enteredPrice = input.nextDouble();
	    
	    
	    //Apply discounts if any applicable
	    if  (enteredPrice >= 250) {
	      totalDiscount = enteredPrice * DISCOUNT_RATE10;
	    }
	    
	    else if (enteredPrice >= 100 && enteredPrice < 250) {
	      totalDiscount = enteredPrice * DISCOUNT_RATE5;
	    } 
	    
	    //Add discount amount
	    if (enteredPrice >= 100) {
	       enteredPrice =  enteredPrice - totalDiscount;
	    }
	    
	    //Calculate sales tax and display to user
	    finalPrice = enteredPrice * SALES_TAX_RATE + enteredPrice;

	    System.out.print("Final Price:$ " + finalPrice);
	}

}
