package epam.homework.task1.trigonometricEquation;

import static java.lang.Math.*;

public class Tangens {

	private double resultMassiv [][];
	private int massivLength;
	private double stepRes;
	
	public double[][] calculate(double startPoint, double finishPoint, int step) throws Exception {
		
		if (startPoint >= finishPoint && step >= 0) {
			throw new Exception("Error! Some data make calculate infinity. Pls check, and change it");
		} else if (step == 0) {
			throw new Exception("Step can\'t be zero! Pls change it");
		} 
		else if(startPoint<=finishPoint && step<=0){
			throw new Exception("Error! Some data make calculate infinity. Pls check, and change it");
		}
			else {

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
