package epam.homework.task1.matrix;

import java.util.Arrays;

public class Calculate {

	MatrixCostruct mCon = new MatrixCostruct();
	private int arr[];

	public int[][] showTheMatrix(int[] startArray) {

		int count = 0;
		int arr2[][] = new int[startArray.length][startArray.length];

		for (int i = 1; i < startArray.length; i++) {

			if (count == 0) {
				arr2[0] = startArray;
				System.out.println(Arrays.toString(arr2[0]));
				count++;
			}

			if (i != 1) {
				
				arr = mCon.mixFirstToLast(arr2[i - 1]);
				arr2[i] = arr;
				System.out.println(Arrays.toString(arr2[i]));
				continue;
			}

			arr2[i] = mCon.mixFirstToLast(startArray);
			System.out.println(Arrays.toString(arr2[i]));
		}
		return arr2;
	}

}
