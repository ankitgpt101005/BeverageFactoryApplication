package com.beverages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beverages.factory.BeverageFactory;

public class BeverageCheck {

	public static void main(String[] args) {
		
		final Logger LOGGER = LoggerFactory.getLogger(BeverageCheck.class);
		// TODO Auto-generated method stub
		
		BeverageFactory beverageFactory = new BeverageFactory();

	  // We can Modify the below contents and run the program to calculate your beverage cost
      String order = " Chai ,-milk, -water,  Coffee, Mojito";

      final double beverageCost = beverageFactory.getInvoiceFromOrder(order);

      LOGGER.info("Your total cost is ${}", beverageCost);

	}

}
