package epam.homework.task1.shellSort;

public class Calculate {

	public static int[] sort(int array[]) throws Exception {

		int a = 0;

		if(array.length == 0)
			throw new Exception("The massiv length can't be a ZERO");
		for (int j = 0; j < array.length - 1; j++)
			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] <= array[i + 1]) {
					continue;
				}

				a = array[i + 1];
				array[i + 1] = array[i];
				array[i] = a;

			}

		return array;
	}

}
