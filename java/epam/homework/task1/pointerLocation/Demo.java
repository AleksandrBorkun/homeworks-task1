package epam.homework.task1.pointerLocation;

public class Demo {

	public static void main(String[] args) throws Exception {

		IsLocated is = new IsLocated();
		// задаем минимальные и максимальлные значаения х в области(для каждой
		// отдельно)
		int x_area[][] = { { -4, 4 }, { -6, 6 } };

		// задаем минимальные и максимальлные значаения у в области(для каждой
		// отдельно)
		int y_area[][] = { { 0, 6 }, { -3, 0 } };

		// задаем координаты точекки которые будем проверять
		int point_one[] = { -6, 1 };
		int point_two[] = { -6, 0 };
		int point_four[] = { 4, 4 };

		// вызываем метод проверяющий положение точки
		System.out.println(is.isLocated(point_one, x_area, y_area));
		System.out.println(is.isLocated(point_four, x_area, y_area));
		System.out.println(is.isLocated(point_two, x_area, y_area));
	}

}
