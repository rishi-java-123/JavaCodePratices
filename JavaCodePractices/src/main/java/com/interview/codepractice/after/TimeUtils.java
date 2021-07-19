package com.interview.codepractice.after;

import java.time.Instant;
import java.time.ZoneId;

public class TimeUtils {
	
	public static void printNewYorkTime(){
		String now = Instant.now().atZone(ZoneId.of("America/New_York")).toString();
		System.out.println(now);
	}

}
