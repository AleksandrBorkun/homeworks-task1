package epam.homework.task1.shellSort;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShellSortTest {

	Calculate sortIt = new Calculate();

	@Test
	public void positivShellsSortTest() throws Exception {

		int expectedResult[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int masForTest[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		int actualResult[] = sortIt.sort(masForTest);
		
		Assert.assertTrue(Arrays.equals(actualResult, expectedResult), "Oooops! Something go wrong!");
		
	}

	@Test(expectedExceptions = {Exception.class})
	public void negativShellsSortTestNull() throws Exception{
		
		sortIt.sort(null);
		
	}
	
	@Test(expectedExceptions = {Exception.class})
	public void negativShellsSortTestZeroLength() throws Exception{
		
		int arr [] = new int [0];
		sortIt.sort(arr);
		
	}
	
}
