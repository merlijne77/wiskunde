

import java.awt.Color;

@SuppressWarnings("unused")
public class GraphingLines {
	public static void main(String[] args) {
		double y, y1;

		Assenstelsel gp1 = new Assenstelsel(10, 10);
		for (double x = -10; x <= 10; x += 0.01) {
			y = 1 * x + 0;
			gp1.drawPoint(x, y);
		}

		Assenstelsel gp2 = new Assenstelsel(320, 10);
		for (double x = -10; x <= 10; x += 0.01) {
			y = -3 * x + 4;
			gp2.drawPoint(x, y);
		}

		Assenstelsel gp3 = new Assenstelsel(630, 10);
		for (double x = -10; x <= 10; x += 0.01) {
			y = 0.5 * x + -3;
			gp3.drawPoint(x, y);
		}

		Assenstelsel gp4 = new Assenstelsel(10, 320);
		for (double x = -10; x <= 10; x += 0.01) {
			y = -2 * x + -2;
			gp4.drawPoint(x, y);
		}

		Assenstelsel gp5 = new Assenstelsel(320, 320);
		for (double x = -10; x <= 10; x += 0.01) {
			y = 2 * x + -1;
			y1 = -0.5 * x + 5;
			gp5.drawPoint(x, y);
			gp5.drawPoint(x, y1);
		}

		Assenstelsel gp6 = new Assenstelsel(630, 320);
		for (double x = -10; x <= 10; x += 0.01) {
			y = 0 * x + 4;
			gp6.drawPoint(x, y);
		}

	}
}
