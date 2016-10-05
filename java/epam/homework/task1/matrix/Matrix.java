package epam.homework.task1.matrix;

public class Matrix {

	//private int mas[];

	public int[][] buildTheMatrix(int[] mas) throws Exception {

		MatrixCostruct costruct = new MatrixCostruct();

		//this.mas = mas;
		if (mas.length == 0 || mas.length == 1)
			throw new Exception("The length can't be ZERO OR ONE!!");

		int array[][] = new int[mas.length][mas.length];
		int count = 0;
		for (int i = 1; i < array.length; i++) {
			if (count == 0) {
				for (int j = 0; j < array[0].length; j++)
					array[0][j] = mas[j];
				count++;
			}
			costruct.mixFirstToLast(mas);
			for (int j = 0; j < mas.length; j++)
				array[i][j] = mas[j];
		}

		return array;
	}

}
