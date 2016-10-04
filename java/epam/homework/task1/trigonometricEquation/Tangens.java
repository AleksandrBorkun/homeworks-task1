package epam.homework.task1.trigonometricEquation;

import static java.lang.Math.*;

public class Tangens {

	private double resultMassiv [][];
	private int massivLength;
	private double stepRes;
	
	public double[][] calculate(double startPoint, double finishPoint, int step) {
		
		if (startPoint >= finishPoint && step >= 0) {
			System.out.println("");
		} else if (step == 0) {
			System.out.println("");
		} else {

		massivLength = (int)abs((finishPoint-startPoint)/step) + 1;
		resultMassiv = new double [massivLength] [2];
		
		for(int i = 0; i<massivLength; i++){
			
			stepRes = startPoint + (step*i);
			
			resultMassiv[i][0] = stepRes;
			resultMassiv[i][1] = tan(stepRes);
						
		}
		}

		return resultMassiv;
	}

}
