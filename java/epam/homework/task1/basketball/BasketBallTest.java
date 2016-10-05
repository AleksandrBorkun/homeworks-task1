package epam.homework.task1.basketball;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketBallTest {

	Basket basket = new Basket();

	@Test
	public void positivBasketBallTest() {

		// ожидаемый результат
		int[] expectedResult = { 280, 9 };
		// фактический результат
		int[] actualResult = basket.fillTheBasket(3, 5, 9, 11, 10);

		Assert.assertTrue(Arrays.equals(expectedResult, actualResult));
	}
}
