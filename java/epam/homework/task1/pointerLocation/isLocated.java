package epam.homework.task1.pointerLocation;

public class IsLocated {

	private int point[] = new int[2];
	private int x_area[][] = new int[2][2];
	private int y_area[][] = new int[2][2];

	public boolean isLocated(int point[], int x_area[][], int y_area[][]) throws Exception {

		this.point = point;
		this.x_area = x_area;
		this.y_area = y_area;

		if (point.length != 2)
			throw new Exception();
		if (x_area.length != 2 && x_area[0].length != 2 && x_area[1].length != 2)
			throw new Exception();
		if (y_area.length != 2 && y_area[0].length != 2 && y_area[1].length != 2)
			throw new Exception();

		for (int i = 0; i < x_area.length; i++) {

			// проверяем входит ли значение координаты "X" в нашу область
			if (point[0] >= x_area[i][0] & point[0] <= x_area[i][1]) {

				for (int j = 0; j < y_area.length; j++) {
					// проверяем входит ли значение координаты "Y" в нашу
					// область
					if (point[1] >= y_area[i][0] && point[1] <= y_area[i][1]) {
						// если координаты нас устроили возвращаем true
						return true;
					} else continue;
					}
			} else continue;

			return false;
		}
		return false;

	}

}
