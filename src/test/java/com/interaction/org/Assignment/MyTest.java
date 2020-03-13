package com.interaction.org.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MyTest {

	CommonWord cw;

	@Test
	public void test1() {
		// testing scenario with common words

		Set<String> expectedResult = new HashSet<>(Arrays.asList("Test2", "Test4"));

		ArrayList<String> l1 = new ArrayList<String>(
				Arrays.asList("Test1", "Test2", "Test3", "Test4", "Test5", "Test6"));
		ArrayList<String> l2 = new ArrayList<String>(
				Arrays.asList("Test2", "Test8", "Test9", "Test4", "Test7", "Test11"));
		cw = new CommonWord(l1, l2);
		long startTime = System.currentTimeMillis();
		Assertions.assertThat(expectedResult).isEqualTo(cw.bruteForceLogic());
		long endTime = System.currentTimeMillis();
		System.out.println("It took " + (endTime - startTime) + " milliseconds");

		startTime = System.currentTimeMillis();
		Assertions.assertThat(expectedResult).isEqualTo(cw.logicUsingHashSet());
		endTime = System.currentTimeMillis();
		System.out.println("It took " + (endTime - startTime) + " milliseconds");

	}

}
