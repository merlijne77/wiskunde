

import java.awt.Color;

@SuppressWarnings("unused")
public class GraphingLines {
	public static void main(String[] args) {
		double y, y1;

		GraphPaper gp1 = new GraphPaper(10, 10);
		for (double x = -10; x <= 10; x += 0.01) {
			y = 1 * x + 0;
			gp1.drawPoint(x, y);
		}

		GraphPaper gp2 = new GraphPaper(320, 10);
		for (double x = -10; x <= 10; x += 0.01) {
			y = -3 * x + 4;
			gp2.drawPoint(x, y);
		}

		GraphPaper gp3 = new GraphPaper(630, 10);
		for (double x = -10; x <= 10; x += 0.01) {
			y = 0.5 * x + -3;
			gp3.drawPoint(x, y);
		}

		GraphPaper gp4 = new GraphPaper(10, 320);
		for (double x = -10; x <= 10; x += 0.01) {
			y = -2 * x + -2;
			gp4.drawPoint(x, y);
		}

		GraphPaper gp5 = new GraphPaper(320, 320);
		for (double x = -10; x <= 10; x += 0.01) {
			y = 2 * x + -1;
			y1 = -0.5 * x + 5;
			gp5.drawPoint(x, y);
			gp5.drawPoint(x, y1);
		}

		GraphPaper gp6 = new GraphPaper(630, 320);
		for (double x = -10; x <= 10; x += 0.01) {
			y = 0 * x + 4;
			gp6.drawPoint(x, y);
		}

	}
}
