package epam.homework.task1.trigonometricEquation;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) throws Exception {

Tangens tan = new Tangens();
		double arr [][] = tan.calculate(20, 30, 4);

	

for(int i = 0; i<arr.length; i++)
	System.out.println( Arrays.toString(arr[i]));
	}

}
