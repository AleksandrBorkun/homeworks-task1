package epam.homework.task1.matrix;

import java.util.Arrays;

import epam.homework.task1.workingWithArrays.RandomArraysNonStatic;

public class Matrix {

	public void pleaseShow() {

		RandomArraysNonStatic arr1 = new RandomArraysNonStatic();
		Calculate cal = new Calculate();

		int array[][] = cal.showTheMatrix(arr1.createIntArray(10, 100));

		for (int i = 0; i < array.length; i++)
			System.out.println(Arrays.toString(array[i]));

		return;
	}

}
