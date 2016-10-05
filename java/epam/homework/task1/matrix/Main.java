package epam.homework.task1.matrix;

import java.util.Arrays;

import epam.homework.task1.workingWithArrays.RandomArrays;

public class Main {
	public static void main(String args[]) throws Exception {

		int mas [] = RandomArrays.createIntArray(10, 1000); 
		Matrix m = new Matrix();
		int array[][]=m.buildTheMatrix(mas);
		for(int i =0; i<array.length; i++){
			System.out.println(Arrays.toString(array[i]));
		}
	}
}
