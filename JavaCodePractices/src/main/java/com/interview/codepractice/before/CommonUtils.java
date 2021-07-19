package com.interview.codepractice.before;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Random;

// this class contains util methods for "anything" (math, time, strings, etc.),
// and it is too broad. so we can distribute in 3 different classes.


public class CommonUtils {
	public static int generteRandomNumberBetween(int low, int high) {
		return new Random().nextInt(high - low) + low;

	}

	public static double convertCurrency() {
		return 0;
	}

	public static int countOccurences(String stringToSearch, char charToFind) {
		int count = 0;

		for (int i = 0; i < stringToSearch.length(); i++) {
			if (stringToSearch.charAt(i) == charToFind) {
				count++;
			}

		}

		return count;

	}
	
	public static void printNewYorkTime(){
		String now = Instant.now().atZone(ZoneId.of("America/New_York")).toString();
		System.out.println(now);
	}
}
