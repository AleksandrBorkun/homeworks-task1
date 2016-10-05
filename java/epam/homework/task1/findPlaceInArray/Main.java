package epam.homework.task1.findPlaceInArray;

import epam.homework.task1.workingWithArrays.RandomArrays;

public class Main {

	public static void main(String args[]) {

		SearchingPosition sPosition = new SearchingPosition();
		int[] arr1 = RandomArrays.createIntArray(10, 100);
		int[] arr2 = RandomArrays.createIntArray(10, 100);

		sPosition.wherePaste(arr1, arr2);

	}
}
