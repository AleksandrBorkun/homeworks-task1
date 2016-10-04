package epam.homework.task1.trigonometricEquation;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

Tangens tan = new Tangens();
		double arr [][] = tan.calculate(20, -10, -2);

	

for(int i = 0; i<arr.length; i++)
	System.out.println( Arrays.toString(arr[i]));
	}

}
