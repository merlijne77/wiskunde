
public class GrafiekTest {
static double x,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assenstelsel gp3 = new Assenstelsel(40, 40);
//		for (double x = -10; x <= 10; x += 0.01) {
//			y = 0.5 * x + -3;
//			gp3.drawPoint(x, y);
		
			for (double x = -10; x <= 10; x += 0.01) {
			y = 1 * x + 3;
		
			gp3.drawPoint(x, y);
		}
	}

}
