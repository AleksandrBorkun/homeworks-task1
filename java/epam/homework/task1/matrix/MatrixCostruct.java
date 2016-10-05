package epam.homework.task1.matrix;

public class MatrixCostruct {

	public int[] mixFirstToLast(int startArray[]) {

		int count = 0;
		int newEnd = 0;

		for (int i = 0; i < startArray.length - 1; i++) {

			if (count == 0) {
				newEnd = startArray[0];
				count++;
			}
			startArray[i] = startArray[i + 1];
			if (i == startArray.length - 2) {
				startArray[startArray.length - 1] = newEnd;

			}

		}
		return startArray;
	}

}
