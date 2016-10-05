package epam.homework.task1.trigonometricEquation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TrigonometricEquationTest {

	Tangens table = new Tangens();
	
	@Test
	public void positivTestTrigonometricEquation() throws Exception{
		
		double actualResult [] []= table.calculate(0, 10, 2);
		int expectedResult = 6;
		
		Assert.assertEquals(actualResult.length, expectedResult, "Something was wrong! Maybe you need to just try again? :)");
		
	}
	
	@Test(expectedExceptions = {Exception.class})
	public void negativZeroStepTestTrigonometricEquation() throws Exception{
		
		table.calculate(0, 10, 0);
		
	}

	@Test(expectedExceptions = {Exception.class})
	public void negativMinusStepTestTrigonometricEquation() throws Exception{
		
		table.calculate(0, 10, -2);
		
	}
	

	@Test(expectedExceptions = {Exception.class})
	public void negativPlusStepWhenNeedMinusTestTrigonometricEquation() throws Exception{
		
		table.calculate(0, -10, 2);
		
	}
	
}
