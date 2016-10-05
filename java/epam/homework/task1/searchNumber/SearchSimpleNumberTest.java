package epam.homework.task1.searchNumber;

import java.util.Arrays;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class SearchSimpleNumberTest {

	// материал для тестирования
	private int masivForTest[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
	private int zeroLengthArray[] = new int[0];

	// ожидаемый результат
	private int[] expectedResult = { 1, 2, 3, 5, 7, 11, 13 };

	// тестируемый обьект
	SimpleNumArray weedNum = new SimpleNumArray();

	@Test
	public void positivSearchSimpleNumberOfArrayTest() throws Exception {

		// фактический результат выборки
		int[] actualResult = weedNum.weedNumbers(masivForTest);

		Assert.assertTrue(Arrays.equals(actualResult, expectedResult));
	}

	@Test(expectedExceptions = { Exception.class })
	public void negativSearchSimpleNumberOfArrayTest() throws Exception {

		weedNum.weedNumbers(null);

	}

	@Test(expectedExceptions = { Exception.class })
	public void negativSearchSimpleNumberOfArrayTestWithZeroLength() throws Exception {

		weedNum.weedNumbers(zeroLengthArray);

	}

}
