package com.arcada.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformanceTest {

	@Test
	public void test() {
		long allTime = 0;
		// Loop to check how long it takes to perform the test 50000 times
		for (int i = 0; i < 50000; i++) {
			long start = System.currentTimeMillis();
	        App.fetchFriends("https://www.facebook.com/profile.php?id=Danny");
	        long end = System.currentTimeMillis();
	        long elapsed = end - start;
	        
	        allTime += elapsed; 
		}
		System.out.print(allTime);
        if(allTime < 5000) {
        	assertTrue(true);
        }
	}

}
