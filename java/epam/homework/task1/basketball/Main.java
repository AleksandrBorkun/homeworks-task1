package epam.homework.task1.basketball;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Basket b = new Basket();
		
		int i[] = b.fillTheBasket(9, 5, 11, 7, 10);

		System.out.println(Arrays.toString(i));

	}

}
