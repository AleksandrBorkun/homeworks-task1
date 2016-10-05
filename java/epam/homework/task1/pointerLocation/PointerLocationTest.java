package epam.homework.task1.pointerLocation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointerLocationTest {
	// тестируемый обьект
	IsLocated is = new IsLocated();

	// задаем минимальные и максимальлные значаения х в области(для каждой
	// отдельно)
	private int x_area[][] = { { -4, 4 }, { -6, 6 } };

	// задаем минимальные и максимальлные значаения у в области(для каждой
	// отдельно)
	private int y_area[][] = { { 0, 6 }, { -3, 0 } };

	// координаты точек для теста
	private int positivTestPoint[] = { 3, 3 }; // true
	private int negativTestPoint[] = { 10, 10 }; // false
	private int negativTest[] = { 3 }; // !!!Error!!!
	private int toManyCoordinates[] = { 1, 2, 3 }; // !!!Error!!!

	// масив нулевой длинны
	int zeroLength[] = new int[0];

	@Test
	public void positivPointerLocationTest() throws Exception {

		Assert.assertTrue(is.isLocated(positivTestPoint, x_area, y_area));

	}

	@Test
	public void negativPointerLocationTest() throws Exception {

		Assert.assertFalse(is.isLocated(negativTestPoint, x_area, y_area));
	}

	@Test(expectedExceptions = { Exception.class })
	public void negativPointerLocationTestOneCoord() throws Exception {
		is.isLocated(negativTest, x_area, y_area);
	}

	@Test(expectedExceptions = { Exception.class })
	public void negativPointerLocationTestTooMantCoord() throws Exception {
		is.isLocated(toManyCoordinates, x_area, y_area);
	}

	@Test(expectedExceptions = { Exception.class })
	public void negativPointerLocationTestZeroMas() throws Exception {
		is.isLocated(zeroLength, x_area, y_area);
	}

	@Test(expectedExceptions = { Exception.class })
	public void negativPointerLocationTestNullMas() throws Exception {

		is.isLocated(null, x_area, y_area);
	}
}
