package com.interview.codepractice.after;

import java.util.Random;

public class NumberUtils {
	
	public static int generteRandomNumberBetween(int low, int high) {
		return new Random().nextInt(high - low) + low;

	}

	public static double convertCurrency() {
		return 0;
	}

}
