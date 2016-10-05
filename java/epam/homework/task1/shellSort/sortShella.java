package epam.homework.task1.shellSort;

import java.util.Arrays;

import epam.homework.task1.workingWithArrays.RandomArrays;

public class SortShella {

	public static void main(String args[]) throws Exception{
		

		int array[] = RandomArrays.createIntArray(10, 100);

		System.out.println("The generation array is: " + Arrays.toString(array));
		System.out.println("The sort array is: " + "\t " +Arrays.toString(Calculate.sort(array)));


	}
}
