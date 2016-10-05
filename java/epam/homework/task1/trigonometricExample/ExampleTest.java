package epam.homework.task1.trigonometricExample;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ExampleTest {

	Example ex = new Example();
	
	@Test
	public void testExamplePositiv(){
		
	
	double actResult = ex.showResult(0, 0);
	double exResult = 0.5;

Assert.assertEquals(actResult, exResult, "Trouble with math...");
}
	}