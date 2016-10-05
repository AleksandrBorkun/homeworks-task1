package epam.homework.task1.matrix;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MatrixBuildTest {

	Matrix construct = new Matrix();

	@Test
	public void positiMatrixBuildTest() throws Exception {

		// подопытный массив
		int testMas[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// ожидаемый результат
		int expectedMatrix[][] = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 2, 3, 4, 5, 6, 7, 8, 9, 10, 1 },
				{ 3, 4, 5, 6, 7, 8, 9, 10, 1, 2 }, { 4, 5, 6, 7, 8, 9, 10, 1, 2, 3 }, { 5, 6, 7, 8, 9, 10, 1, 2, 3, 4 },
				{ 6, 7, 8, 9, 10, 1, 2, 3, 4, 5 }, { 7, 8, 9, 10, 1, 2, 3, 4, 5, 6 }, { 8, 9, 10, 1, 2, 3, 4, 5, 6, 7 },
				{ 9, 10, 1, 2, 3, 4, 5, 6, 7, 8 }, { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 } };

		// реально получаемый результат
		int actualResult[][] = construct.buildTheMatrix(testMas);

		Assert.assertTrue(Arrays.deepEquals(expectedMatrix, actualResult), "Something was wrong! It's Can't be true!");

	}

	// серия негативных тестов

	@Test(expectedExceptions = { Exception.class })
	public void negativNullMatrixBuildTest() throws Exception {

		construct.buildTheMatrix(null);
	}

	@Test(expectedExceptions = { Exception.class })
	public void negativZeroLengthMatrixBuilder() throws Exception {

		int zeroLengthMas[] = new int[0];
		construct.buildTheMatrix(zeroLengthMas);

	}

	@Test(expectedExceptions = { Exception.class })
	public void negativOneElementMatrixBuilder() throws Exception {

		int[] oneElementMasiv = { 1 };
		construct.buildTheMatrix(oneElementMasiv);

	}
}
