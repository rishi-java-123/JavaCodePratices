package com.interview.codepractice.after;

public class StringUtils {
	
	public static int countOccurences(String stringToSearch, char charToFind) {
		int count = 0;

		for (int i = 0; i < stringToSearch.length(); i++) {
			if (stringToSearch.charAt(i) == charToFind) {
				count++;
			}

		}

		return count;

	}
	

}
