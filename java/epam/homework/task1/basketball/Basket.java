package epam.homework.task1.basketball;

public class Basket {

	private Ball green = new Ball("Green", 10);
	private Ball red = new Ball("Red", 15);
	private Ball blue = new Ball("Blue", 7);
	private Ball orange = new Ball("Orange", 35);

	private int sumOfWeight;
	private int resultArray[] = new int[2];

	public int[] fillTheBasket(int countOfGreenBalls, int countOfRedBalls, int countOfBlueBalls,
			int countOfOrangeBalls) {

		sumOfWeight = countOfGreenBalls * green.getBallWeight() + countOfRedBalls * red.getBallWeight()
				+ countOfBlueBalls * blue.getBallWeight() + countOfOrangeBalls * orange.getBallWeight();

		resultArray[0] = sumOfWeight;
		resultArray[1] = countOfBlueBalls;

		return resultArray;

	}

}
