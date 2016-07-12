package com.zuehlke.cleancodeworkshop.removeduplication;

public class MathUtils {

	private MathUtils() {
	}

	public static boolean isDivisibleBy(int number, int divider) {
		return number % divider == 0;
	}

	// make methods equal -> extract parameter ctrl-alt-p
	// use one method in other method
	// inline method that uses other method
}
