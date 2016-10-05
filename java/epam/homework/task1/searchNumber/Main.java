package epam.homework.task1.searchNumber;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		int k = 0;
		int arr[] = { 1, 11, 22, 23, 37, 31 };
		List<Integer> arrList = SearchSimple.theSimpleNumInArray(arr);
		
		int length = arrList.size();
		int someNewArr[] = new int[length];
		for (int i : arrList) {

			someNewArr[k] = i;
			k++;
		}
		
		System.out.println(Arrays.toString(someNewArr));

	}

}
