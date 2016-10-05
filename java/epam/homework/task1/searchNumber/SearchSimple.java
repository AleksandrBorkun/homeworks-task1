package epam.homework.task1.searchNumber;

import java.util.ArrayList;
import java.util.List;

public class SearchSimple {

	public static List<Integer> theSimpleNumInArray(int[] array) throws Exception {

		List<Integer> simpleNumOfArray = new ArrayList<>();

		if (array.length == 0) {
			throw new Exception("The length is zero. So There is no any number");
		}

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 1 || array[i] == 2 || array[i] == 3) {
				System.out.println("The " + array[i] + " is a simple number, and its on " + i + " position");
				simpleNumOfArray.add(array[i]);
			}

			else {
				for (int j = 2; j < ((array[i] / 2) + 1); j++) {
					if ((array[i] % j) == 0) {
						break;
					} else if ((array[i] % j) != 0) {
						if (j == array[i] / 2) {
							simpleNumOfArray.add(array[i]);
							System.out
									.println("The " + array[i] + " is a simple number, and its on " + i + " position");
						}
						continue;}}}}

		return simpleNumOfArray;
	}

}
