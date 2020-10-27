import java.awt.Color;

public class Grafiek {

	public static void main(String[] args) {

		double y;
		double a, h, k;
		
		//Huiswerk les 8 opdracht 1
				Assenstelsel ass1 = new Assenstelsel(500, 500, 4, 4);
				for ( double x = -10; x<=10; x+=0.01 )//
				{
					a = 2;
					h = -0.25; //k = 5;
					y= h * x + a;
//					y = a*Math.pow(x,2) + k;
					ass1.drawLine(x,y, Color.BLUE);
					ass1.drawLine(x, y+1, Color.RED);
				}

	}

}
