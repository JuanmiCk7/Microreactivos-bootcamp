package com.nttdata;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		
		int counter = 0;
		
		
		for (Integer number : numbers) {
			if(number>10) {
				counter++;
			}
		}
		
		
		System.out.println(counter);
		counter = 0;
		
		System.out.println(numbers.stream().filter(x -> x > 10).count());

	}

}
