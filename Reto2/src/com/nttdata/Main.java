package com.nttdata;

import java.util.List;
import java.util.stream.Collectors;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		List<Product> shopping = List.of(
                new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
                new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
                new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
                new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
                new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
                new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
		
		
		Double totalPrice = shopping.stream().mapToDouble
				(item -> item.price.doubleValue()+(item.tax.percent*item.price.doubleValue()/100)).sum();
		
		
		System.out.println("El precio total es: " + totalPrice);
				
		List<Product> newShoppingList = shopping.stream().filter(item -> item.name.startsWith("C"))
																			 .sorted()
											 								 .toList();
											 
		
		for (Product product : newShoppingList) {
			System.out.println(product.name);
		}
		
	}

}
