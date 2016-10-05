package epam.homework.task1.searchNumber;

import java.util.List;

public class SimpleNumArray {
	
	private int k = 0;

	public int[] weedNumbers(int[] array) throws Exception {

		List<Integer> arrList = SearchSimple.theSimpleNumInArray(array);

		int length = arrList.size();
		int simpleNumMasiv[] = new int[length];
		
		for (int i : arrList) {
			simpleNumMasiv[k] = i;
			k++;
		}

		return simpleNumMasiv;
	}

}
